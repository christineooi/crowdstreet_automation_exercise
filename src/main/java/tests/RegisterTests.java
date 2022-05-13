package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BeforeAfterTests {
    @Test
    public void registerTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.clickCreateAnAccountButtonInNavBar();
        String generatedStr = RandomStringUtils.randomAlphabetic(8);
        String emailAddress = generatedStr + "@test.com";
        String firstName = generatedStr + "_" + reader.getRegisterFirstName();
        String lastName = generatedStr + "_" + reader.getRegisterLastName();
        createAccountPage.validRegistration(firstName, lastName, emailAddress, reader.getRegisterPassword(), reader.getRegisterIsAccredited());
        assertTrue(createAccountPage.signOutButtonIsVisible());
    }
}

