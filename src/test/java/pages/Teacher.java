package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class Teacher extends BasePage {
    @FindBy(xpath = "ssss")
    public WebElement username1;
    @Override
    public WebElement username() {
        return null;
    }
}
