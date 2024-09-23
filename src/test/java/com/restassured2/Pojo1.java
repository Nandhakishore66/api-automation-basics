package com.restassured2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

import java.util.Arrays;

public class Pojo1 {
    public static void main(String[] args) throws JsonProcessingException {
        Pojo pojo1 = new Pojo();
        pojo1.setFirstName("Nandha");
        pojo1.setLastName("Kishore");
        pojo1.setEmail("Nandha@gmail");
        pojo1.setSkills(Arrays.asList("Java", "Selenium"));

        //After setting the value. we are retrieving the value using get method
        System.out.println(pojo1.getFirstName());
        System.out.println(pojo1.getLastName());
        System.out.println(pojo1.getEmail());
        System.out.println(pojo1.getSkills());

        //------------------Session 15------------------------------
        //Create object mapper from jackson databind library not from rest assured or unirest
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo1);
      System.out.println(json);
    }
}
