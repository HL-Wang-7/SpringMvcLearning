package com.HL.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 3 创建SpringMvcConfig类，并加载对应的bean
@Configuration
@ComponentScan("com/HL/controller")
public class SpringMvcConfig {
}

