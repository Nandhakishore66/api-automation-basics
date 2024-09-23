package org.example;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class unirestHttpRequestExample {


    public void getRequestInUnirest() throws UnirestException {
        HttpResponse<JsonNode> jsonNode = Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
        System.out.println("Response code is " + jsonNode.getStatus());
        System.out.println("Response code is " + jsonNode.getStatusText());
        System.out.println("Response code is " + jsonNode.getBody());
    }

    public void postRequestInUnirest() throws UnirestException {
        HttpResponse<JsonNode> jsonNode = Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"Naveen\",\"salary\":\"30000\",\"age\":\"23\"}").asJson();
        System.out.println("Response code is " + jsonNode.getStatus());
        System.out.println("Response code is " + jsonNode.getStatusText());
        System.out.println("Response code is " + jsonNode.getBody());
    }

    public void putRequestInUnirest() throws UnirestException {
        HttpResponse<JsonNode> jsonNode = Unirest.put("https://dummy.restapiexample.com/api/v1/update/7821").body("{\"name\":\"Naveen\",\"salary\":\"30000\",\"age\":\"25\"}").asJson();
        System.out.println("Response code is " + jsonNode.getStatus());
        System.out.println("Response code is " + jsonNode.getStatusText());
        System.out.println("Response code is " + jsonNode.getBody());
    }
    public void deleteRequestInUnirest() throws UnirestException {
        HttpResponse<JsonNode> jsonNode = Unirest.delete("https://dummy.restapiexample.com/api/v1/employees").asJson();
        System.out.println("Response code is " + jsonNode.getStatus());
        System.out.println("Response code is " + jsonNode.getStatusText());
        System.out.println("Response code is " + jsonNode.getBody());
    }

    public static void main(String[] args) throws UnirestException {
        unirestHttpRequestExample example = new unirestHttpRequestExample();
        example.getRequestInUnirest();
    }

}
