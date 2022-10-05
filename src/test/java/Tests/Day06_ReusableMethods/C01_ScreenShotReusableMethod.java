package Tests.Day06_ReusableMethods;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void testName() throws IOException {

        // Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");

        // Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");

        // Sayfayı kapatınız.
        Driver.quitDriver();
    }

    @Test
    public void test02() throws IOException {

        // Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperties("amznUrl"));
        AmazonPage amznPage = new AmazonPage();

        // Nutella aratınız
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amznPage.aramaSonucWE);

    }
}
