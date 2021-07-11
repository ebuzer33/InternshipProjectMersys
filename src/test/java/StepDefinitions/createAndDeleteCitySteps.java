package StepDefinitions;

import Pages.leftNav;
import Pages.parent;
import cucumber.api.java.en.And;

public class createAndDeleteCitySteps extends parent {
    private final leftNav leftNav;

    public createAndDeleteCitySteps(Pages.leftNav leftNav) {
        this.leftNav = leftNav;
    }


    @And("^Click to Cities Button$")
    public void clickToCitiesButton() {
        leftNav.findAndClick(leftNav.getCitiesButton());

    }
}
