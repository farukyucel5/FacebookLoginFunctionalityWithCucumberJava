package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='_6ltg'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMesaage;

    @FindBy(xpath = "//span[text()='Pharuk']")
    public WebElement successfulLogin;

}
