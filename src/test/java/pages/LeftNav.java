package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupButtonInCountry;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement citiesButton;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupButtonInEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(css = "a[href='/subjects/list']")
    private WebElement subjects;

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

    public WebElement getEducation() {
        return education;
    }

    public WebElement getSetupButtonInEducation() {
        return setupButtonInEducation;
    }

    public WebElement getSubjectCategories() {
        return subjectCategories;
    }

    public WebElement getSubjects() {
        return subjects;
    }
}
