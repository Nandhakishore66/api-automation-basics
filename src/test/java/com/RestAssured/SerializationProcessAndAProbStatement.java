package com.RestAssured;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializationProcessAndAProbStatement {

    public void serializationProcessAndAProbStatementExample() {
        //---------------Session12---------------------------
        //Map<String, String> jsonBody = new HashMap<String, String>();
        Map<String, Object> jsonBody = new HashMap<String, Object>();
        jsonBody.put("Name", "Kishore");
        jsonBody.put("Email", "123@gmail.com");
        /*Now I have to add the skill. As skill is a multiselect dropdown we can select
        multiple values. so we cannot add that in map, we have to use list here. if insertion order
        should be maintained and duplicate values should be allowed means we can use ArrayList or linked list
         */
        List<String> listOfSkills = new ArrayList<String>();
        listOfSkills.add("selenium");
        listOfSkills.add("Java");

        /*Now we can add this list in the map, but as we mentioned the value as string in map
        generics it will not accept the list here. So I need to update that value as Object(In this we can store
        any kind of data type).
         */

        //jsonBody.put("skills", listOfSkills);

        jsonBody.put("skills", listOfSkills);

        //It will print the map result, but we want Json result..
        System.out.println(jsonBody);

        //---------------Session13---------------------------
        //---------------------------------------------------------------------------------------------
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type", "application/json")
                .body(jsonBody)//Normally we pass the data here, but now we have the data in the json body variable
                .log()
                .all()
                .when()
                .post("api/users")
                .then()
                .log()
                .all();

    } // It will throw an cannot serialize error for that download jackson databind library
    public static void main(String[] args) {
        SerializationProcessAndAProbStatement obj = new SerializationProcessAndAProbStatement();
        obj.serializationProcessAndAProbStatementExample();
    }
}
