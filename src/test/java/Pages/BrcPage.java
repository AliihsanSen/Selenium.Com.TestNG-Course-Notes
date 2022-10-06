package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrcPage {

    public BrcPage() { // Constructor oluşturup public yapmamız gerekir.

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@tabindex='0'])[1]")
    public WebElement login;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement userEmail;

    @FindBy (xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;
}
