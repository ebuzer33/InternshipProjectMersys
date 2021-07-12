package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.support.PageFactory;

public class formContent extends parent{
    public formContent() {
        PageFactory.initElements(baseDriver.getDriver(),this);
    }
}
