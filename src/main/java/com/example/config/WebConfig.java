package com.example.config;

import org.springframework.boot.webmvc.autoconfigure.DispatcherServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebConfig {

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public DispatcherServletRegistrationBean dispatcherServletRegistration(
            DispatcherServlet dispatcherServlet) {

        DispatcherServletRegistrationBean registration =
                new DispatcherServletRegistrationBean(dispatcherServlet, "/api/*");

        registration.setName("apiDispatcherServlet");
        registration.setLoadOnStartup(1);
        return registration;
    }
}
