package com.example.zipkin.zipkin_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;


@Configuration
@EnableAspectJAutoProxy // This enables AOP proxying (AspectJ-based)
@EnableLoadTimeWeaving // This enables LTW support in Spring
public class AopConfig{
}
