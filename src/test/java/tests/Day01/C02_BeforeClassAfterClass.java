package tests.Day01;

import Utilities.TestBaseBeforeClassAfterClass;
import org.testng.annotations.Test;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void amazonTesti() {

        driver.get("https://amazon.com");
    }

    @Test
    public void bestbuyTesti() {

        driver.get("https:/www.bestbuy.com");
    }

}
