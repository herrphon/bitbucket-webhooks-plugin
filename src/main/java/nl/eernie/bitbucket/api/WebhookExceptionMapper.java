package nl.eernie.bitbucket.api;

import com.atlassian.bitbucket.rest.exception.UnhandledExceptionMapper;
import com.atlassian.bitbucket.rest.exception.UnhandledExceptionMapperHelper;
import com.atlassian.plugin.spring.scanner.annotation.component.Scanned;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.ext.Provider;

@Provider
@Scanned // Force atlassian-spring-scanner to include this class; otherwise its @ComponentImport is ignored
@Singleton
public class WebhookExceptionMapper extends UnhandledExceptionMapper {

    public WebhookExceptionMapper(@ComponentImport UnhandledExceptionMapperHelper helper) {
        super(helper);
    }
}
