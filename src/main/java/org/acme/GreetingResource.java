package org.acme;

import org.acme.pojo.CustomHttpRequest;
import org.acme.pojo.ResponseData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("{pathText}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseData testContext(@Context CustomHttpRequest httpRequest,
                                    @PathParam("pathText") String querryText) {

       return ResponseData.builder()
                .querryText(querryText)
                .httpRequestText(httpRequest.getText())
                .secured(httpRequest.isSecured())
                .build();
    }
}