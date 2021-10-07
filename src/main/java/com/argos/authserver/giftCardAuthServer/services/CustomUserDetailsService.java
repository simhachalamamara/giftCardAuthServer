package com.argos.authserver.giftCardAuthServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.argos.authserver.giftCardAuthServer.entity.User;
import com.argos.authserver.giftCardAuthServer.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String input) throws UsernameNotFoundException {
		User user = userRepository.findByusername(input);
		System.out.println(user);

		if (user == null) {
			throw new BadCredentialsException("invalid credentials");
		}

		new AccountStatusUserDetailsChecker().check(user);

		return user;

	}

}