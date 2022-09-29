package Tests.Day03_ConfigurationProperties;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        // Amazona sayfasına ve facebook sayfasına gidelim.
        String url = ConfigReader.getProperties("amznUrl");
        Driver.getDriver().get(url);

        String urlFace = ConfigReader.getProperties("faceUrl");
        Driver.getDriver().get(urlFace);
    }
}
