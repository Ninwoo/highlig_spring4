package com.typh.highlight_spring4.ch2.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我（bean-listener)接收到了beanDemopublisher发布的消息:" + msg);
    }
}
