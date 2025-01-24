package com.HL.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4 定义一个servlet启动的配置类，在里面加载SpringMVC的配置文件
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    // 加载SpringMVC的配置文件
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    // 设置哪些请求归属springmvc处理，哪些请求交给tomcat处理
    @Override
    protected String[] getServletMappings() {
//        return new String[0];
        return new String[] { "/" }; // 表示处理所有请求都交给SpringMVC处理
    }

    // 加载Spring的配置文件
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
