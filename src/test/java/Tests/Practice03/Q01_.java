package Tests.Practice03;

import Pages.HerokuTestPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q01_ {

    // Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    // Click all the buttons and verify they are all clicked
    
    HerokuTestPage herokuTestPage;
    
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testName() {
    }
}
