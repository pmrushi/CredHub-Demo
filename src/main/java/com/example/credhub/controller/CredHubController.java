package com.example.credhub.controller;

import com.example.credhub.CredHubProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredHubController {

    @Autowired
    private CredHubProperties credHubProperties;

    @GetMapping("/")
    public String credentials() {
        return credHubProperties.mySecretKey;
    }

}
