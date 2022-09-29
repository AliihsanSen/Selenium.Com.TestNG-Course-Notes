package tests.Day01_IlkTestTestNG;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /*
    - TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder.
     (Yukardan asagi degil!)
    - @Test notasyonunun yanına (priority = sayı) yazarsak testlerin çalışma
      sırasını belirlemiş oluruz.
    - Önce en küçük olan çalışır
    - priority olarak herhangi bir sayı yazılmamışsa 0 olarak kabul edilir.
 */

    @Test (priority = 1)
    public void youtubeTest() {

        driver.get("https:/www.youtube.com");
    }

    @Test (priority = 3)
    public void bestbuyTesti() {

        driver.get("https:/www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTesti() {

        driver.get("https://amazon.com");
    }

}
