package com.ly.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;

import java.awt.*;

/**
 * @author WU
 */
@EnableBinding(MySource.class)
public class SendService {

    @Autowired
    private MySource mySource;

    public void sendMsg(String msg) {
        mySource.myOutput().send(MessageBuilder.withPayload(msg).build());
    }
}
