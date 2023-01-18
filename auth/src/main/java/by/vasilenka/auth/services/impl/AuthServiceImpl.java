package by.vasilenka.auth.services.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import by.vasilenka.auth.domain.User;
import by.vasilenka.auth.dto.AuthRequestDto;
import by.vasilenka.auth.repositories.UserRepository;
import by.vasilenka.auth.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    private final BCrypt.Hasher hasher;

    private final BCrypt.Verifyer verifyer;

    private static final int COST = 4;

    @Override
    public String auth(AuthRequestDto authRequestDto) {

        Optional<User> user = userRepository.findByName(authRequestDto.getUsername());
        if(user.isPresent()){
            User authUser = user.get();
            BCrypt.Result result = verifyer.verify(authRequestDto
                    .getPassword().toCharArray(),  // password from auth request
                    authUser.getPassword()// hash from table service_user
            );
            if(result.verified){
                StringBuilder token = new StringBuilder();
                token.append(hasher.hashToString(COST, authUser.getName().toCharArray()));
                token.append("__");
                token.append(hasher.hashToString(COST, authUser.getRole().getName().toCharArray()));

                return token.toString();
                // hash(username)
                // hash(role)

            }
        }
        throw new RuntimeException(String.format("User %s is not present", authRequestDto.getUsername()));
    }

    @Override
    public boolean isTokenValid(String token) {
        String [] tokens = token.split("__");
        String hashedName = tokens[0]; // name
        String hashedRole = tokens[1]; // role
        List<User> userList = userRepository.findAll();
        Optional<User> authUser = userList.stream()
                .filter(user -> verifyer
                        .verify(user.getName().toCharArray(),
                                hashedName).verified).findFirst();
        return authUser.isPresent() && verifyer.verify(authUser.get()
                .getRole().getName().toCharArray(), hashedRole).verified;
    }
}
