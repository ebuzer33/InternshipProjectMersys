package StepDefinitions;

import Pages.loginPage;
import Utilities.baseDriver;
import XmlFiles.excelUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class loginSteps {

    loginPage login = new loginPage();

    @Given("^Navigate to website$")
    public void navigateToWebsite() {
        WebDriver driver = baseDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password$")
    public void enterUsernameAndPassword() {

        List<List<String>> list = excelUtility.getListData("src/test/java/Resources/Mersys_Demo.xlsx", "correctLogin", 2);

        for (int i = 0; i < list.size(); i++) {
            login.sendKeysFunction(login.getUserName(), list.get(i).get(0));
            login.sendKeysFunction(login.getPassword(), list.get(i).get(1));
        }
    }

    @And("^Click to login button$")
    public void clickToLoginButton() {
        login.clickFunction(login.getLoginButton());
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        login.verifyContainsText(login.getDashboard(), "Dashboard");
    }

    @And("^Click to accept cookies$")
    public void clickToAcceptCookies() {
        login.clickFunction(login.getCookies());
    }

    @When("^Enter wrong username and password$")
    public void enterWrongUsernameAndPassword() {

        List<List<String>> list = excelUtility.getListData("src/test/java/Resources/Mersys_Demo.xlsx", "wrongLogin", 2);

        for (int i = 0; i < list.size(); i++) {
            login.sendKeysFunction(login.getUserName(), list.get(i).get(0));
            login.sendKeysFunction(login.getPassword(), list.get(i).get(1));
        }
    }

    @Then("^User should not be logged in and should see the error message$")
    public void userShouldNotBeLoggedInAndShouldSeeTheErrorMessage() {
        login.verifyContainsText(login.getLoginErrorMessage(), "Invalid username or password");
    }


}
