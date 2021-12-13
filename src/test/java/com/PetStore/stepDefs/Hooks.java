package com.PetStore.stepDefs;

import com.PetStore.utilies.ConfigurationReader;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.baseURI;


public class Hooks {

    @Before
    public static void setUp() {
        baseURI = ConfigurationReader.get("url");
    }
}
