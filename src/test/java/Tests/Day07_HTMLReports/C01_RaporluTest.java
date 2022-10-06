package Tests.Day07_HTMLReports;

import Pages.BrcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_RaporluTest extends TestBaseRapor {

    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void testName() {

        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");

        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperties("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");

        BrcPage brcPage = new BrcPage();
        Actions actions = new Actions(Driver.getDriver());

        // -login butonuna bas
        brcPage.login.click();
        extentTest.info("login butonuna basıldı");

        // -test data user email: customer@bluerentalcars.com ,
        brcPage.userEmail.sendKeys(ConfigReader.getProperties("userEmail"));

        // -test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperties("pass")).
        sendKeys(Keys.ENTER).perform();

        extentTest.info("Doğru kullanıcı email ve password girildi");
        extentTest.info("Ikinci login butonuna basıldı");

        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName = brcPage.basariliGiris.getText();
        String expectedUserName = "John Walker";
        Assert.assertEquals(expectedUserName,actualUserName);
        extentTest.pass("Sayfaya basarili sekilde girildi");
    }
}
