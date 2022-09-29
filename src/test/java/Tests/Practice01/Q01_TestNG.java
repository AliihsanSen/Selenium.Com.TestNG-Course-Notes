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
                .dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.Italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.Spain)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.SouthKorea)
                .dragAndDrop(dhtmlgoodiesPage.copanhagen, dhtmlgoodiesPage.Denmark)
                .dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.Norway)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.UnitedStates)
                .dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.Sweden).perform();

    }
}
