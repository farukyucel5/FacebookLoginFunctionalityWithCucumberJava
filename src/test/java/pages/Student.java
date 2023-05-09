package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class Student extends BasePage {

    @FindBy(xpath = "ssss")
    public WebElement username2;
    @Override
    public WebElement username() {
        return null;
    }
}
