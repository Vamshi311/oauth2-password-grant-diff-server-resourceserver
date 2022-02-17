package com.learning.oauth2passwordgrantdiffserverresourceserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@ConfigurationProperties(prefix = "security.jwt")
@Data
public class SecurityJwtProperties {
    
    private Resource publicKey;
}
