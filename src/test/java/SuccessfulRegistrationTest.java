import Models.Requests.SuccessfulRequest;
import Steps.NonValidRequestSteps;
import Steps.SuccessfulRequestSteps;
import Steps.UnsuccessfulRequestSteps;
import org.testng.annotations.Test;

public class SuccessfulRegistrationTest {
    @Test
    public void successfulRegistration() {
        SuccessfulRequestSteps successfulRequestSteps = new SuccessfulRequestSteps();

        successfulRequestSteps.successfulRequest();
    }
}
