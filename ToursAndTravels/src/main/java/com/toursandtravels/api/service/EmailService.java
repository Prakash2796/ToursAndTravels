package com.toursandtravels.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Value("${spring.mail.username}")
    String emailSender;

    @Value("${spring.mail.password}")
    String emailPassword;


    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            message.setFrom(emailSender);
            mailSender.send(message);
        } catch (Exception exception) {
            System.out.println(exception);
        }


    }

    // Method for sending HTML email
    public void sendEmail(String to, String subject, String htmlContent) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setTo(to);
            helper.addCc("prakash.sathe2721@gmail.com");
            helper.addCc("sometimescalm@gmail.com");
            helper.setSubject(subject);
            helper.setFrom(emailSender);
            helper.setText(htmlContent, true); // 'true' indicates HTML content

            mailSender.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException exception) {
            System.out.println("Error sending HTML email: " + exception);
        }
    }
}

