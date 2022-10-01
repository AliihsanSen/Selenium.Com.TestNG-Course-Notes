package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmcPage {

    public HmcPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement girisEkrani;

    @FindBy(xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagament;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement roomReservations;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement ıdUser;

}
