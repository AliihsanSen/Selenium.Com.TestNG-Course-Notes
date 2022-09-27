package tests.Day01;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C01_BeforeMethodMethodAfterMethodMethod extends TestBaseBeforeMethodAfterMethod {

    /*
    ==> TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve
    @AfterMethod kullanılır
     ==> Çalışma prensibi JUnit deki Before,After ile aynıdır
     */

    @Test
    public void amazonTesti() {

        driver.get("https://amazon.com");
    }

    @Test
    public void bestbuyTesti() {

        driver.get("https:/www.bestbuy.com");
    }
}
