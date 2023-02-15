package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.FacebookPage;
import utilities.Driver;

import java.time.Duration;

public class FacebookStepdefinitions {
    FacebookPage qualitydemyPage;
    public WebDriver driver;
    @Given("navigate to the website")
    public void navigateToTheWebsite() {
        qualitydemyPage= new FacebookPage();
        driver= Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @And("enter your username<{string}>")
    public void enterYourUsername(String email) {
        qualitydemyPage.emailBox.sendKeys(email);

    }

    @And("enter the password<{string}>")
    public void enterThePassword(String password) {
        qualitydemyPage.passwordBox.sendKeys(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        qualitydemyPage.loginButton.click();
    }

    @Then("verify the error message")
    public void verifyTheErrorMessage() {
        Assert.assertTrue(qualitydemyPage.errorMesaage.isDisplayed());
        System.out.println(qualitydemyPage.errorMesaage);

    }


    @Then("verify the user has logged in successfully")
    public void verifyTheUserHasLoggedInSuccessfully() {
        Assert.assertTrue(qualitydemyPage.successfulLogin.isDisplayed());

    }
}
