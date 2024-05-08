package com.programming.techie.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.boot.context.annotation.Configuration;

@Configuration
public class Securityconfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        httpSecurity.authorizeHttpRequest(authorize -> authorize.anyRequest()
        )
    }

}
