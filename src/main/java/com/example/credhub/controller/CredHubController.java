package com.example.credhub.controller;

import com.example.credhub.CredHubProps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredHubController {

    private CredHubProps credHubProps;

    public CredHubController(CredHubProps credHubProps) {
        this.credHubProps = credHubProps;
    }

    @GetMapping("/prop")
    public String credentials() {
        String key = credHubProps.mysecretkey;
        return key == null ? "Not Found" : key;
    }

}
