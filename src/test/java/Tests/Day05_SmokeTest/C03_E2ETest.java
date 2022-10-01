package Tests.Day05_SmokeTest;

import Pages.HmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_E2ETest {

    @Test
    public void E2ETest() throws InterruptedException {

        // https://www.hotelmycamp.com adresine git.
        String url = ConfigReader.getProperties("hotelUrl");
        Driver.getDriver().get(url);
        HmcPage hmcPage = new HmcPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        // Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        // Username : manager
        // Password  : Manager1!
        // Login butonuna tıklayın.
        hmcPage.login.click();
        hmcPage.userName.sendKeys(ConfigReader.getProperties("userName"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperties("password")).
                sendKeys(Keys.ENTER).perform();

        // Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hmcPage.hotelManagament.click();
        hmcPage.roomReservations.click();
        hmcPage.addRoomReservation.click();

        // Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        // Save butonuna tıklayın.
        hmcPage.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB)
                .sendKeys("Happy Hotel", Keys.TAB)
                .sendKeys("1500", Keys.TAB)
                .sendKeys("10/02/2022", Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("10/13/2022", Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("2", Keys.TAB).sendKeys("2", Keys.TAB)
                .sendKeys(faker.name().fullName(), Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone(), Keys.TAB)
                .sendKeys(faker.internet().emailAddress(), Keys.TAB)
                .sendKeys("güzel günleer", Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        // “RoomReservation was inserted successfully” textinin göründüğünü test edin.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hmcPage.roomReservationsText.isDisplayed());

        // OK butonuna tıklayın.
        hmcPage.okButton.click();

        // Sayfayı kapatınız.
        Driver.quitDriver();

    }
}
