import Steps.NonValidRequestSteps;
import Steps.SuccessfulRequestSteps;
import org.testng.annotations.Test;

public class RegistrationWithNonValidParameters {
    @Test
    public void registrationWithNonValidParameters() {
        NonValidRequestSteps nonValidRequestSteps = new NonValidRequestSteps();

        nonValidRequestSteps.nonValidRequest();
    }
}
