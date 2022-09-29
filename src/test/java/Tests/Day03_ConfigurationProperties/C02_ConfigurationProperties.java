package Tests.Day03_ConfigurationProperties;

import Utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        Driver.getDriver().get("amznUrl");
    }
}
