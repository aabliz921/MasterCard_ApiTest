package com.PetStore.stepDefs;

import com.PetStore.utilies.ConfigurationReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.cucumber.java.en.*;

import io.restassured.response.*;
import io.restassured.http.ContentType;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;

public class PetDetailsStepDefs {
    Response resbonse;

    @When("I get a pets that exist in the store by {string}")
    public void i_get_a_pets_that_exist_in_the_store_by(String status) {
        resbonse = given().accept(ContentType.JSON).and()
                .queryParam(status, "available")
                .when().get(ConfigurationReader.get("getPetsByStatus"));

    }


    @Then("Response data status code should be {int}")
    public void response_data_status_code_should_be(int statusCode) {
        //Verifying the status code from GET operation.
        assertEquals(statusCode, resbonse.statusCode());


    }


    @Then("Response pets status shoud be {string} is {string}")
    public void response_pets_status_shoud_be_is(String name, String doggie) {
        //JSON payload returned by get operation is converted into ArrayList.
        ArrayList<Map<String, String>> payLoad = resbonse.as(ArrayList.class);
        System.out.println("There are " + payLoad.size() + " of pets available");

        //Filting the Json payload based on the name using stream class and converted into new ArrayList
        ArrayList<Map<String, String>> filertedPayload = payLoad.stream()
                .filter(x -> x.get(name).equals(doggie))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("There are " + filertedPayload.size() + " of pets named doggie");

        for (Map<String, String> map : filertedPayload) {
            //Verifying status and name returned from GET operation with the datatable value.
            assertEquals(doggie, map.get("name"));
            assertEquals("available", map.get("status"));
        }


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Printing the filtedJsonPayLoad as Json format
        System.out.println(gson.toJson(filertedPayload));


    }

}
