package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='u_0_5_ln']")
    public WebElement login;

    @FindBy(xpath = "//*[@class=\"_9ay7\"]")
    public WebElement hataliGiris;

}
