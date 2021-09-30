package Steps;

import Models.Requests.SuccessfulRequest;
import Models.Responses.SuccessResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class SuccessfulRequestSteps {
    private static final String BASE_URL = "https://reqres.in";
    public static Response response;
    public SuccessfulRequestSteps successfulRequest() {
        RestAssured.baseURI = BASE_URL;
        SuccessfulRequest successfulRequest = new SuccessfulRequest("eve.holt@reqres.in", "pistol");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(successfulRequest). post("/api/register");

        if(response.statusCode() == 200) {
            ResponseBody body = response.getBody();
            SuccessResponse responseBody = body.as(SuccessResponse.class);

            Assert.assertEquals("4", responseBody.id);
            Assert.assertEquals("QpwL5tke4Pnpja7X4", responseBody.token);

        }
return this; }
}
