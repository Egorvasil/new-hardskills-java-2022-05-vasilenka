package by.vasilenka.auth.services;

import by.vasilenka.auth.domain.User;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * API to get all users
 */
public interface UserService {

    List<User> getAllUsers(HttpServletRequest httpServletRequest);

}
