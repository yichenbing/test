package com.ycbbcy.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 处理Spring ApplicationEvent
 * Application events are sent in the following order, as your application runs:
 * <p>
 * <br>An ApplicationStartingEvent is sent at the start of a run but before any processing, except for the registration of listeners and initializers.
 * <br>An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known but before the context is created.
 * <br>An ApplicationPreparedEvent is sent just before the refresh is started but after bean definitions have been loaded.
 * <br>An ApplicationStartedEvent is sent after the context has been refreshed but before any application and command-line runners have been called.
 * <br>An ApplicationReadyEvent is sent after any application and command-line runners have been called. It indicates that the application is ready to service requests.
 * <br>An ApplicationFailedEvent is sent if there is an exception on startup.
 */
@Slf4j
public class CustomerApplicationListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Object source = event.getSource();
        log.info("捕获到ApplicationEvent，event类名：{}，source类名：{}", event.getClass().getName(), source.getClass().getName());
    }
}
