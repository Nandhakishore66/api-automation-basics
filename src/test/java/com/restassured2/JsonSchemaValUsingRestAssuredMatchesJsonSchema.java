package com.restassured2;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JsonSchemaValUsingRestAssuredMatchesJsonSchema {
    public void jsonSchemaValidationUsingRestAs() throws FileNotFoundException {
        File inputJson = new File("src/test/resources/input.json");
        FileInputStream input = new FileInputStream("src/test/resources/schema.json");
                //Anything we can use reader. file, inputstream............
                 RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body(inputJson)
                .when()
                .post("/employees")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchema(input));
//session 18
    }

}

