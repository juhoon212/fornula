package com.fornula.domain.util.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.Validator;
// 이거 필요한건가?
@Configuration
public class ValidationConfig {
    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}