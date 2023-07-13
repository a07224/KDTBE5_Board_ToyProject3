package com.board.domain.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MailTestComponents {
    private final JavaMailSender javaMailSender;

    public void sendMailTest(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("a07224@naver.com");
        simpleMailMessage.setSubject("안뇽 잘 도착했니");
        simpleMailMessage.setText("테스트");

        javaMailSender.send(simpleMailMessage);
    }
}
