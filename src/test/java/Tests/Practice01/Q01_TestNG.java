package Tests.Practice01;

import Pages.DhtmlgoodiesPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q01_TestNG {

    @Test
    public void test01() {

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Fill in capitals by country.
        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());

        actions
                .dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.Italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.Spain)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.SouthKorea)
                .dragAndDrop(dhtmlgoodiesPage.copanhagen, dhtmlgoodiesPage.Denmark)
                .dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.Norway)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.UnitedStates)
                .dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.Sweden).perform();

        Driver.quitDriver();

     /** Frameworkler büyüdükçe yeni classlar yeni test methodları yeni webelementler olusturdukça içinden çıkılmaz
      * anlasılmaz, tekrar bakımı yapılamaz, güncellemesi çok zor hatta imkansız bir hal alır
      *
      * uzmanlar reusable maintainable, rahat manipule edilebilir bir framwork için bir design pattern olarak
      * POM PAGE OBJECT MODEL de karar vermisler
      * olmazsa olmazlar
      * 1) driver class
      * 2) PAGE class
      * 3) test class
      * utilities
      *
      * Aradığımız bir web elementi yada bir metohdu kolaylıkla bulabilmek ve güncelleyebilmek için
      * javadan öğrenmis olduğumuz oop concept selenium ile page object model de birlesitirilmis oluyuor
      *
      */
    }
}
