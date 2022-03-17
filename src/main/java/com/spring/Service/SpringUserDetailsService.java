package com.spring.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SpringUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$YXiFvfC7bQcf1xfqcBA6gOi5fBrlsS4y2VcQRwiF0bL50G.JakStW",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("invalid user" + username);
		}

	}

}
