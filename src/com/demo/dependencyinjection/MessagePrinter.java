package com.demo.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ramesh on 08/05/16.
 */
@Component
public class MessagePrinter {


    @Autowired
    MessageService messageService;

   /* @Autowired
    public MessagePrinter(MessageService messageService) {

        this.messageService = messageService;
    }*/

    public void pringMessage() {
        System.out.println(messageService.getMessage());
    }

}
