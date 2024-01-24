package registration.java.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import registration.java.login.web.dto.UserRegistrationDto;
import registration.java.login.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
