import Steps.SuccessfulRequestSteps;
import Steps.UnsuccessfulRequestSteps;
import org.testng.annotations.Test;

public class UnsuccessfulRegistrationTest {
    @Test
    public void unsuccessfulRegistration() {
        UnsuccessfulRequestSteps unsuccessfulRequestSteps = new UnsuccessfulRequestSteps();

        unsuccessfulRequestSteps.unsuccessfulRequest();
    }
}
