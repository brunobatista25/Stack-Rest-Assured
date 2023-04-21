package br.com.back.tests;

import com.github.javafaker.Faker;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static br.com.back.service.UserService.*;
import static br.com.back.support.utils.BaseRest.*;
import static br.com.back.support.utils.GetVariable.getProp;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreateUserTests {
    ValidatableResponse response;

    static Faker faker = new Faker();
    static String name = faker.name().firstName();
    static String email = faker.internet().emailAddress();

    @Test
    public void createUserWithSuccess(){
        createUser(name, email, "123456","false");

        response = getResponse().then().log().all();

        assertEquals(201,response.extract().statusCode());
        assertEquals(getProp("message"), response.extract().path("message"));
        assertNotNull(response.extract().path("_id"));

    }
}
