package com.anaclara.shopy.services;

import org.springframework.mail.SimpleMailMessage;

import com.anaclara.shopy.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}