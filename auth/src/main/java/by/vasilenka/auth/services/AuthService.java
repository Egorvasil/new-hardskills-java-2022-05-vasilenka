package by.vasilenka.auth.services;


import by.vasilenka.auth.dto.AuthRequestDto;
import by.vasilenka.auth.dto.AuthResponseDto;

/**
 *  API for authorization and password verification
 */
public interface AuthService {

    String auth(AuthRequestDto authRequestDto);

    boolean isTokenValid(String token);

}
