package Tests.Day06_ReusableMethods;

import Pages.AmazonPage;
import Tests.Day09_Log4J.C01_Log4JTest01;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C01_ScreenShotReusableMethod {

    private static Logger logger = LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());

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
        ReusableMethods.getScreenshotWebElement("AramaSonucWE", amznPage.aramaSonucWE);

    }
}
