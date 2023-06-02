package org.acme.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author kristjan.pucko
 */
@Data
@Builder
@ToString
public class ResponseData {

    private String querryText;
    private String httpRequestText;
    private Boolean secured;
}
