package com.example.credhub.controller;

import com.example.credhub.CredHubProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/credhub")
public class CredHubController {

    @Autowired
    private CredHubProps credHubProps;

    @GetMapping("/keys")
    public CredHubProps credentials() {
        return credHubProps;
    }
}
