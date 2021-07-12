package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends parent {

    public loginPage() {
        PageFactory.initElements(baseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement userName;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    private WebElement loginErrorMessage;

    @FindBy(xpath = "//div[@class='ccb__button']/button")
    private WebElement cookies;


    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCookies() {
        return cookies;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getLoginErrorMessage() {
        return loginErrorMessage;
    }
}
