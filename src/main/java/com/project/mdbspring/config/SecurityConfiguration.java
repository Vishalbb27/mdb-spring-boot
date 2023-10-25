package com.project.mdbspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SecurityConfiguration {

    public SecurityFilterChain applicationFilter(HttpSecurity http) throws Exception{
        http
                .csrf(csrfConfig -> csrfConfig.disable())
                .securityMatcher("/**")
                .authorizeRequests()
                .requestMatchers(("/**"))
                .permitAll()
                .and()
                .sessionManagement(sessionMgmt -> sessionMgmt.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }
}
