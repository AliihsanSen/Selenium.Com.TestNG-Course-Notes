package Tests.Day04_SingletonPattern;

import Pages.HotelPages;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_NegatifTest {

    @Test
    public void test01() {

        // https://www.hotelmycamp.com/ adresine git
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);
        HotelPages hotelPages = new HotelPages();

        // login butonuna bas
        hotelPages.login.click();

        // test data username: manager1 ,  test data password : manager1!
        hotelPages.userName.sendKeys("manager1");
        hotelPages.password.sendKeys("Manager1!");
        hotelPages.loginButton.click();

        // Degerleri girildiginde sayfaya girilemedigini test et
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelPages.girisYapilamadi.isDisplayed());
    }
}
