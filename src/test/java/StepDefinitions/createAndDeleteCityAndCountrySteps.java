package StepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class createAndDeleteCityAndCountrySteps {
    //aaa

    private final Pages.dialogContent dialogContent;

    public createAndDeleteCityAndCountrySteps(Pages.dialogContent dialogContent) {
        this.dialogContent = dialogContent;
    }

    @And("^Select a Country as \"([^\"]*)\" to Add$")
    public void selectACountryAsToAdd(String name) {
        dialogContent.findAndClick(dialogContent.getCountrySelectAddClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),name);

    }

    @Then("^Item Can't delete message should be displayed$")
    public void itemCanTDeleteMessageShouldBeDisplayed() {
        dialogContent.verifyContainsText(dialogContent.getItemCantDeleteMessage(),"can't");

    }

    @And("^Select a Country as \"([^\"]*)\" to Search$")
    public void selectACountryAsToSearch(String name)  {
        dialogContent.findAndClick(dialogContent.getCountrySelectSearchClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),name);

    }
}
