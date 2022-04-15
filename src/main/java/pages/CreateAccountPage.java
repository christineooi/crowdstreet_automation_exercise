package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CreateAccountPage extends BasePage {
    private By createAccountButtonInNavBar = By.xpath("//div[@id='app-header']//a[text()='Create An Account']");
    private By firstNameTextField = By.id("firstName");
    private By lastNameTextField = By.id("lastName");
    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("password");
    private By confirmPasswordTextField = By.id("confirmPassword");
    private By accreditedYesRadioButton = By.id("accreditedYes");
    private By accreditedNoRadioButton = By.id("accreditedNo");
    private By hasAgreedTosCheckbox = By.id("hasAgreedTos");
    private By recaptchaIFrame= By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
    private By recaptchaCheckbox = By.xpath("//div[@class='recaptcha-checkbox-border']");
    private By createAnAccountSubmitButton = By.xpath("//div[@id='content-well']//form/button");
    private By signOutButton = By.xpath("//div[@id='app-header']//button");



    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAnAccountButtonInNavBar(){
        System.out.println("in clickCreateAnAccountButtonInNavBar");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(createAccountButtonInNavBar)).click();
    }

    public void validRegistration(String fname, String lname, String email, String psword, String isAccredited){
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(firstNameTextField));

        driver.findElement(firstNameTextField).sendKeys(fname);
        driver.findElement(lastNameTextField).sendKeys(lname);
        driver.findElement(emailTextField).sendKeys(email);
        driver.findElement(passwordTextField).sendKeys(psword);
        driver.findElement(confirmPasswordTextField).sendKeys(psword);

        if (isAccredited == "Yes")
            driver.findElement(accreditedYesRadioButton).click();
        else
            driver.findElement(accreditedNoRadioButton).click();

        driver.findElement(hasAgreedTosCheckbox).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(recaptchaIFrame));
        wait.until(ExpectedConditions.elementToBeClickable(recaptchaCheckbox)).click();

        driver.switchTo().defaultContent();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(createAnAccountSubmitButton)).click();
    }

    public boolean signOutButtonIsVisible(){    
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton));
        return driver.findElement(signOutButton).isDisplayed();
    }
}
