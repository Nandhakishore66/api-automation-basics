package com.RestAssured;

import io.restassured.RestAssured;

import java.io.File;

public class RequestFromJsonBody {

    public void requestFromJsonBodyExample(){
        File jsonFile = new File("postData.json");
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body(jsonFile)
                .when()
                .post("api/users")
                .asPrettyString();

    }
}
