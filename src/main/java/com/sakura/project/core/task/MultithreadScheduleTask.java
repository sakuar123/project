package com.sakura.project.core.task;

import java.time.LocalDateTime;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/9/6 9:57
 */
@Slf4j
@Component
@EnableAsync
@EnableScheduling
public class MultithreadScheduleTask {

    @Autowired
    private ServletContext servletContext;

    @Async
    @Scheduled(cron = "0 */10 * * * ?")
    public void first() throws InterruptedException {
        log.info("第一个定时任务执行:{}", LocalDateTime.now().toLocalTime());
    }
}
