package by.vasilenka.auth.services.impl;

import by.vasilenka.auth.domain.User;
import by.vasilenka.auth.repositories.UserRepository;
import by.vasilenka.auth.services.AuthService;
import by.vasilenka.auth.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final AuthService authService;

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers(HttpServletRequest httpServletRequest) {

        String authToken = httpServletRequest.getHeader("Authorization");
        if(authService.isTokenValid(authToken)){
            return userRepository.findAll();
        }
        throw new RuntimeException(String.format("Token %s is not valid", authToken));
    }
}
