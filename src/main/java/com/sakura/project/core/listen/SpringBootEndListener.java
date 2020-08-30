package com.sakura.project.core.listen;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * springBoot全局监听器:监听程序销毁的时候
 */
@Slf4j
@Component
public class SpringBootEndListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        log.info("SpringBoot销毁成功。");
    }
}
