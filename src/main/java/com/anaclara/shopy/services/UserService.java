package com.anaclara.shopy.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.anaclara.shopy.security.UserSS;

public class UserService {
	
	// método retorna usuário logado
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}