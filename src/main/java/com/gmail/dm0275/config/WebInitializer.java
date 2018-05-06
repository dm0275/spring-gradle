package com.gmail.dm0275.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This class replaces our web.xml configurations and is the entry point to our web application. It registers our
 * root/application configuration, our servlet configuration, as well as our servlet mappings. This class is also
 * responsible for creating the {@link org.springframework.web.servlet.DispatcherServlet} which is essentially the
 * front controller of the application.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootContextConfig.class };
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { ServletContextConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
