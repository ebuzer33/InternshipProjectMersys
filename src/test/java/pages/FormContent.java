package pages;

import utilities.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
}
