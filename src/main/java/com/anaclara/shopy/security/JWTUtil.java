package com.anaclara.shopy.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component // pode ser injeto em outras classes
public class JWTUtil {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private Long expiration;

	public String generateToken(String username) {
		return Jwts.builder()//gerador de token
				.setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + expiration)) //quando o token vai expirar = horáio atual + tempo de expiração
				.signWith(SignatureAlgorithm.HS512, secret.getBytes())
				.compact();
	}
}