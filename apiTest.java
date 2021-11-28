package com.potatoshka;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

public class apiTest {
    @Test
    public void test(){
        RestAssured.when().get("https://reqres.in/api/users/2").then().
                assertThat().statusCode(200).and().body("data.first_name", is("Janet"));
    }

}


