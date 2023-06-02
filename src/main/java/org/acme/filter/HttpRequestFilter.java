package org.acme.filter;

import org.acme.pojo.CustomHttpRequest;
import org.jboss.resteasy.core.ResteasyContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author kristjan.pucko
 */
@Provider
@ApplicationScoped
public class HttpRequestFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) {
        CustomHttpRequest request = CustomHttpRequest.builder()
                .headers(requestContext.getHeaders())
                .dateTime(LocalDateTime.now())
                .text("Some random text for example " + new Random().nextInt(100))
                .build();
        ResteasyContext.pushContext(CustomHttpRequest.class, request);
    }
}
