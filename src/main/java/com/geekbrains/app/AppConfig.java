package com.geekbrains.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.geekbrains.app")
public class AppConfig {

    @Bean //помечает красным Scope

}
