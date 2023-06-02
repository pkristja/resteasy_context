package org.acme.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.ws.rs.core.MultivaluedMap;
import java.time.LocalDateTime;

/**
 * @author kristjan.pucko
 */
@Getter
@Builder
@ToString
public class CustomHttpRequest {

    private String text;
    private LocalDateTime dateTime;
    private MultivaluedMap<String, String> headers;
    private boolean secured;
}
