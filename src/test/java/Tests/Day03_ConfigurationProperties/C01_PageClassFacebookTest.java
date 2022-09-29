package Tests.Day03_ConfigurationProperties;

import Pages.FacebookPage;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C01_PageClassFacebookTest {

    @Test
    public void test01() {

        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        // POM’a uygun olarak email, sifre kutularini ve giris yap
        // butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        // Faker class’ini kullanarak email ve sifre degerlerini
        // yazdirip, giris butonuna basin
        actions.click(facebookPage.email).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.ENTER).perform();

        // Basarili giris yapilamadigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(facebookPage.hataliGiris.isEnabled());

        // Sayfayı kapatınız.
        Driver.quitDriver();

    }
}
