package com.gmail.dm0275.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.gmail.dm0275.controller")
/**
 * This class defines out servlet configuration, this is where we specify our view resolvers and our resource handlers. It is possible to have multiple servlet configurations.
 */
public class ServletContextConfig implements WebMvcConfigurer {

    @Override
    /**
     * This method configures our view resolver.
     */
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    /**
     * This method configures our static resources.
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}
