package com.restassured2;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

public class JsonSchemaValUsingRestAssured {

    public void jsonSchemaValidationUsingRestAssuredExample() {
        File inputJson = new File("src/test/resources/input.json");
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body(inputJson)
                .when()
                .post("/employees")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
//session 17
    }

}
