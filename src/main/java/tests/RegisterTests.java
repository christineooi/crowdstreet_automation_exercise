package tests;

import org.testng.annotations.Test;
import pages.CreateAccountPage;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BeforeAfterTests {
    @Test
    public void registerTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.clickCreateAnAccountButtonInNavBar();
        createAccountPage.validRegistration(reader.getRegisterFirstName(), reader.getRegisterLastName(), reader.getRegisterEmail(), reader.getRegisterPassword(), reader.getRegisterIsAccredited());
        assertTrue(createAccountPage.signOutButtonIsVisible());
    }
}

