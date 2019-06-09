package com.kg.learn.spring.noxml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kg.learn.spring.noxml")
@PropertySource("classpath:sport.properties")
public class DemoConfigNoXml {

}
