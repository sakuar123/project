package com.sakura.project.common.util;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/25 14:31
 */
@Slf4j
@Component
public class EmailUtil {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private Environment environment;

    public void sendMail(String to, String subject, String text) {
        String form = environment.getProperty("spring.mail.username");
        Assert.isTrue(ObjectTools.isNotBlank(to), "收件人不能为空");
        Assert.isTrue(ObjectTools.isNotBlank(subject), "邮件主题不能为空");
        Assert.isTrue(ObjectTools.isNotBlank(text), "邮件内容不能为空");
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(Objects.requireNonNull(form));
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(text);
            javaMailSender.send(simpleMailMessage);
            log.info("发送成功");
        } catch (Exception e) {
            log.error("发送邮件异常");
        }
    }
}
