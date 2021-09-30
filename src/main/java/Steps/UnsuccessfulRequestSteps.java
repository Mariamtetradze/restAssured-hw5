package Steps;

import Models.Requests.UnsuccessfulRequest;
import Models.Responses.FailureResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UnsuccessfulRequestSteps {
    public static Response response;
    public UnsuccessfulRequestSteps unsuccessfulRequest() {
        UnsuccessfulRequest unsuccessfulRequest = new UnsuccessfulRequest("sydney@fife");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(unsuccessfulRequest). post("https://reqres.in/api/register");

        if (response.statusCode() == 400) {

            FailureResponse responseBody = response.as(FailureResponse.class);
            Assert.assertEquals("Missing password", responseBody.error);
        }
   return this; }
}
