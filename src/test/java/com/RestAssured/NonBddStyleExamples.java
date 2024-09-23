package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleExamples {
    public void getRequestExample() {
        RestAssured.baseURI = "https://reqres.in/";
        //Restassured.given which means(Rest assured kita na koduthuruka specification ennana)
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.GET, "api/users?page=2");
        //It will convert the response into pretty string and print it
        System.out.println(response.asPrettyString());
        //It will get the status message and code
        System.out.println(response.getStatusLine());

    }

    public void PostRequestExample() {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"John Cena\",\n" +
                        "    \"job\": \"Fighter\"\n" +
                        "}");
        //Either I have to ended with / in base uri or start with / in request method not in both places..
        Response response = requestSpecification.request(Method.POST, "api/users");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusLine());

    }

    public void PutRequestExample() {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"men\",\n" +
                        "    \"job\": \"kingMaker\"\n" +
                        "}");
        //Either I have to ended with / in base uri or start with / in request method not in both places..
        Response response = requestSpecification.request(Method.PUT, "/api/users/2");//2 refers --> Id value
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusLine());
    }

    public void deleteRequestExample() {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.DELETE, "/api/users/2");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusLine());
    }

    public void getSingleUserExample() {
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.GET, "/api/users/1");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusLine());
    }

    public static void main(String[] args) {
        NonBddStyleExamples nonBddStyleExamples = new NonBddStyleExamples();
        nonBddStyleExamples.getRequestExample();
        nonBddStyleExamples.PostRequestExample();
    }
}
