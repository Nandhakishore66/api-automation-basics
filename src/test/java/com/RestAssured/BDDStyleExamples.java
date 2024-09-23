package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class BDDStyleExamples {
    public void getRequestExample() {

        RestAssured.given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users?page=2")
                .prettyPrint();
    }

    public void postRequestExample() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"men\",\n" +
                        "    \"job\": \"king\"\n" +
                        "}")
                .when()
                .post("api/users")
                .getStatusLine();
    }

    public void putRequestExample() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"men\",\n" +
                        "    \"job\": \"kingMaker\"\n" +
                        "}")
                .when()
                .put("api/users/2")
                .asPrettyString();
    }


    public void DELETERequestExample() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .when()
                .delete("api/users/2")
                .getStatusLine();
    }
}
