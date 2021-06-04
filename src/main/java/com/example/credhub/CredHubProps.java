package com.example.credhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties("vcap.services.mycredhub.credentials")
@JsonIgnoreProperties(value = {"$$beanFactory"})
public class CredHubProps {
    //add whatever properties you need in here that are stored in CredHub

    private String mySecretKey;

    private String myKey;
}