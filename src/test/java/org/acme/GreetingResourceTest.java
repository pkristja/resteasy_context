package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.pojo.ResponseData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {

        ResponseData actual = given()
          .when().get("/hello/random")
          .then()
             .statusCode(200).extract().body().as(ResponseData.class);

        Assertions.assertEquals("random", actual.getQuerryText());
        Assertions.assertTrue(actual.getHttpRequestText().contains("Some random text for example"));
    }

}