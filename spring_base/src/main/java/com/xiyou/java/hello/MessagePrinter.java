package com.xiyou.java.hello;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {


    private MessageService service;

    public MessagePrinter() {
        System.out.println("message Printer ...");
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    public void PrintMessage() {
        System.out.println(this.service.getMessage());
    }

}
