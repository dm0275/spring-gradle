package com.gmail.dm0275.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = {"com.gmail.dm0275.service"})
/**
 * This class defines our root context (or application context) which should contain globally available/visible resources to the web application and other web components.
 * Components such as services, repositories, etc. should be scanned from this class.
 */
public class RootContextConfig {
}