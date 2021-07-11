package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class dialogContent extends parent{

    public dialogContent() {
        PageFactory.initElements(baseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement searchCodeInput;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement countrySelectAddClick;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement countrySelectSearchClick;

    @FindBy(css = "div[role='listbox']>mat-option")
    List<WebElement> selectOption;

    @FindBy(xpath = "(//div[@aria-live='polite'])[2]/div[2]")
    private WebElement ItemCantDeleteMessage;


    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSearchNameInput() {
        return searchNameInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchCodeInput() {
        return searchCodeInput;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getDeleteDialogButton() {
        return deleteDialogButton;
    }

    public List<WebElement> getSelectOption() {
        return selectOption;
    }

    public WebElement getItemCantDeleteMessage() {
        return ItemCantDeleteMessage;
    }

    public WebElement getCountrySelectAddClick() {
        return countrySelectAddClick;
    }

    public WebElement getCountrySelectSearchClick() {
        return countrySelectSearchClick;
    }
}
