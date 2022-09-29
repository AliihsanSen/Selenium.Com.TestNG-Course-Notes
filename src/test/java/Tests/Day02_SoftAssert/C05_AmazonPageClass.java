package Tests.Day02_SoftAssert;

import Pages.AmazonPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C05_AmazonPageClass {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
}
