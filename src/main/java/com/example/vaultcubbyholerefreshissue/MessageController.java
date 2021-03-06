package com.example.vaultcubbyholerefreshissue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return message;
    }
}
