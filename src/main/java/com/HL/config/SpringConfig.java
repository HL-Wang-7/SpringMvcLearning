package com.HL.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// Spring核心配置文件
@Configuration
@ComponentScan("com.HL.service")
@PropertySource("classpath:jdbc.properties")
@Import(value = {JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement // 开启事务管理
public class SpringConfig {
}
