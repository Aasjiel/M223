package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/calculate/add/3/65")
          .then()
             .statusCode(200)
             .body(is("Das ergebnis ist: 68.0"));
    }

}