package xenonStack.java.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import xenonStack.java.login.model.User;
import xenonStack.java.login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
