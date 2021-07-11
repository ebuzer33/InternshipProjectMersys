package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leftNav extends parent{

    public leftNav() {
        PageFactory.initElements(baseDriver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupButtonInCountry;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement citiesButton;

    public WebElement getSetupButtonInCountry() {
        return setupButtonInCountry;
    }

    public WebElement getParametersButton() {
        return parametersButton;
    }

    public WebElement getCountriesButton() {
        return countriesButton;
    }

    public WebElement getCitiesButton() {
        return citiesButton;
    }


}
