package Steps;

import Models.Requests.NonValid;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class NonValidRequestSteps {
    public static Response response;
    public NonValidRequestSteps nonValidRequest() {

        NonValid nonValid = new NonValid("morpheus","leader");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(nonValid). post("https://reqres.in/api/users");

        Assert.assertEquals(response.getStatusCode(), 201);

        return this;
    }

}
