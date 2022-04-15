package tests;

import helpers.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterTests
{
    protected WebDriver driver;
    protected ConfigFileReader reader;

    @BeforeMethod
    public void beforeAllTests() {
        reader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", reader.getChromeDriverPath());
        driver = new ChromeDriver();
        driver.get(reader.getApplicationUrl());
        driver.manage().window().maximize();
    }

    @AfterMethod()
    public void afterEachTest() {
        driver.close();
    }
}
