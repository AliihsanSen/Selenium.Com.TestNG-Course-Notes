package Tests.Day05_SmokeTest;

import Pages.HmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_SmokeNegatifTest {

    @Test
    public void yanlisKullaniciTest() {

        // https://www.hotelmycamp.com/ adresine git
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);
        HmcPage hotelPages = new HmcPage();

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

    @Test
    public void yanlisSifreTest() {

        // https://www.hotelmycamp.com/ adresine git
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);
        HmcPage hotelPages = new HmcPage();

        // login butonuna bas
        hotelPages.login.click();

        // test data username: manager ,  test data password : manager1
        hotelPages.userName.sendKeys("manager");
        hotelPages.password.sendKeys("manager1");
        hotelPages.loginButton.click();

        // Degerleri girildiginde sayfaya girilemedigini test et
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelPages.girisYapilamadi.isDisplayed());
    }

    @Test
    public void yanlisKullaniciveSifreTest() {

        // https://www.hotelmycamp.com/ adresine git
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);
        HmcPage hotelPages = new HmcPage();

        // login butonuna bas
        hotelPages.login.click();

        // test data username: manager1 ,  test data password : manager1
        hotelPages.userName.sendKeys("manager1");
        hotelPages.password.sendKeys("manager1");
        hotelPages.loginButton.click();

        // Degerleri girildiginde sayfaya girilemedigini test et
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelPages.girisYapilamadi.isDisplayed());

    }
}
