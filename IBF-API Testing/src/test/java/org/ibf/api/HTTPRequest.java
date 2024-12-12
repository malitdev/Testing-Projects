package org.ibf.api;


import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class HTTPRequest {

    int id;

    @Test(priority = 4)
    void getUsers(){

        given()
                .when()
                    .get("https://reqres.in/api/users?page=2")
                .then()
                    .statusCode(200)
                    .body("page",equalTo(2))
                    .log().all();

    }

    @Test(priority = 1)
    void createUser() {

        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "Dave");
        data.put("job", "Software Engineer");

        id=given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");

    }

}
