package com.safetynet.safetynetalerts.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class CustomProperties {
    String realpath;
    String testpath;
    String environment;
}
