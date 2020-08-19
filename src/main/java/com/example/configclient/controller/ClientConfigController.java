package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("clientconfig")
public class ClientConfigController {
    @Value("${from}")
    private String fromString;

    @GetMapping("/from")
    public String getEv() {
        return fromString;
    }
}