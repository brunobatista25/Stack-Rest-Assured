package br.com.back.tests

import br.com.back.service.UserService.createUser
import io.restassured.response.ValidatableResponse
import com.github.javafaker.Faker
import org.junit.Assert
import org.junit.Test
import br.com.back.support.utils.BaseRest.response
import br.com.back.support.utils.GetVariable.getProp

class CreateUserTests {
    var responseRequest: ValidatableResponse? = null
    @Test
    fun createUserWithSuccess() {
        createUser(name, email, "123456", "false")
        responseRequest = response!!.then().log().all()
        Assert.assertEquals(201, responseRequest!!.extract().statusCode().toLong())
        Assert.assertEquals(getProp("message"), responseRequest!!.extract().path("message"))
        Assert.assertNotNull(responseRequest!!.extract().path("_id"))
    }

    companion object {
        var faker = Faker()
        var name = faker.name().firstName()
        var email = faker.internet().emailAddress()
    }
}