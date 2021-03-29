package dev;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

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

    @Test
    public void testStudent() {
        Student student = new Student();
        student.name = "andre";
        given().contentType(ContentType.JSON).body(student)
        .post("/students")
        .then() 
        .statusCode(201).body(equalTo("{\"id\":1,\"name\":\"andre\"}"));
    }
}