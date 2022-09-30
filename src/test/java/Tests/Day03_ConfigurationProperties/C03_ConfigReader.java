package Tests.Day03_ConfigurationProperties;

import Pages.HotelPages;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_ConfigReader {

    @Test
    public void test() {


        // https://www.hotelmycamp.com/ adresine git
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);

        // login butonuna bas
        HotelPages hotelPages = new HotelPages();
        /*
        Page Class'ındaki locate'lerimize ulaşabilmek için Page classımızdan bir obje
        oluşturara, oluşturmuş olduğumuz obje ile page class'ımızdaki locate'leriimize
        ulaşabiliriz.
         */
        hotelPages.login.click();

        // test data username: manager ,  test data password : Manager1!
        hotelPages.userName.sendKeys("manager");
        hotelPages.password.sendKeys("Manager1!");
        hotelPages.loginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelPages.girisEkrani.isDisplayed());
    }
}
