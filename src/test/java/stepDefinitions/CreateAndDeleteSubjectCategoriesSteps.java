package stepDefinitions;

import cucumber.api.java.en.And;
import pages.LeftNav;

public class CreateAndDeleteSubjectCategoriesSteps {

    private final LeftNav leftNav;

    public CreateAndDeleteSubjectCategoriesSteps(LeftNav leftNav) {
        this.leftNav = leftNav;
    }

    @And("^Click to Education$")
    public void clickToEducation() {
        leftNav.findAndClick(leftNav.getEducation());

    }

    @And("^Click on Setup under Education$")
    public void clickOnSetupUnderEducation() {
        leftNav.findAndClick(leftNav.getSetupButtonInEducation());

    }

    @And("^Click to Subject Categories$")
    public void clickToSubjectCategories() {
        leftNav.findAndClick(leftNav.getSubjectCategories());
    }
}
