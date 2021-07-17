package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='description']")
    private WebElement addDescriptionInput;

    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='variable']")
    private WebElement addVariableInput;

    @FindBy(css = "input[name='priority']")
    private WebElement priorityInput;

    @FindBy(css = "input[formcontrolname='integrationCode']")
    private WebElement integrationCodeInput;

    @FindBy(css = "input[data-placeholder='Amount']")
    private WebElement amountInput;

    @FindBy(css = "mat-select[formcontrolname='modifierType']")
    private WebElement addModifierTypeClick;

    @FindBy(css = "mat-select[formcontrolname='valueType']")
    private WebElement addValueTypeClick;

    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='name']")
    private WebElement formNameInput;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.KEY']>input")
    private WebElement formKeyInput;

    @FindBy(css = "ms-integer-field[placeholder='SALARY_CONSTANTS.FIELD.VALUE']>input")
    private WebElement formValueInput;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Valid From']")
    private WebElement formValidFromClick;

    @FindBy(xpath = "//tbody/tr/td[@role='gridcell']")
    private List<WebElement> calendar;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement formNameSearch;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Key']")
    private WebElement formKeySearch;

    @FindBy(xpath = " //ms-text-field[@name='description']/input")
    private WebElement descriptionInBudgetGroupAdd;

    @FindBy(xpath = " (//mat-select/div)[3]")
    private WebElement statusClick;

    @FindBy(xpath = "//mat-option/span")
    private List<WebElement> selectOptionStatus;

    @FindBy(xpath = "  ((//mat-form-field/div)[6]/div)[1]")
    private WebElement startDateInBudget;

    @FindBy(xpath = "  ((//mat-form-field/div)[7]/div)[1]")
    private WebElement endDateInBudget;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement typeinCostCenterClick;

    @FindBy(xpath = "//mat-option[@role='option']/span")
    private List<WebElement> typeSeleckoptionInCostCenter;

    @FindBy(xpath = "//ms-text-field[@type='number']")
    private WebElement sendOrderNoInCostCenter;

    @FindBy(xpath = "//mat-chip-list/div/input[@placeholder='Expense account code prefixes']")
    private WebElement expenseAccountCodeInCostCenter;




    public WebElement getAddDescriptionInput() {
        return addDescriptionInput;
    }

    public WebElement getAddVariableInput() {
        return addVariableInput;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }

    public WebElement getIntegrationCodeInput() {
        return integrationCodeInput;
    }

    public WebElement getAmountInput() {
        return amountInput;
    }

    public WebElement getAddModifierTypeClick() {
        return addModifierTypeClick;
    }

    public WebElement getAddValueTypeClick() {
        return addValueTypeClick;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormKeyInput() {
        return formKeyInput;
    }

    public WebElement getFormValueInput() {
        return formValueInput;
    }

    public WebElement getFormValidFromClick() {
        return formValidFromClick;
    }

    public List<WebElement> getCalendar() {
        return calendar;
    }

    public WebElement getFormNameSearch() {
        return formNameSearch;
    }

    public WebElement getFormKeySearch() {
        return formKeySearch;
    }

    public WebElement getDescriptionInBudgetGroupAdd() {
        return descriptionInBudgetGroupAdd;
    }

    public WebElement getStatusClick() {
        return statusClick;
    }

    public List<WebElement> getSelectOptionStatus() {
        return selectOptionStatus;
    }

    public WebElement getStartDateInBudget() {
        return startDateInBudget;
    }

    public WebElement getEndDateInBudget() {
        return endDateInBudget;
    }

    public WebElement getTypeinCostCenterClick() { return typeinCostCenterClick;  }

    public List<WebElement> getTypeSeleckoptionInCostCenter() { return typeSeleckoptionInCostCenter; }

    public WebElement getSendOrderNoInCostCenter() { return sendOrderNoInCostCenter;  }

    public WebElement getExpenseAccountCodeInCostCenter() {  return expenseAccountCodeInCostCenter;  }


}
