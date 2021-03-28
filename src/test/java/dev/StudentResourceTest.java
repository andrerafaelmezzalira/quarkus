package dev;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class StudentResourceTest {

    @Test
    public void testStudents() {
        given()
          .when().get("/students")
          .then()
             .statusCode(200)
             .body(is("[]"));
    }

}