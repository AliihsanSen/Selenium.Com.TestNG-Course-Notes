package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {

    protected WebDriver driver;
    protected Actions actions;
    protected String tarih;

    /*
    TestNG framework'unde before ve after notasyonlari yerine
    @BeforeMethod ve @AfterMetyhod kullanilir
    Calisma prensibi Junit'deki before-after ile aynidir
     */

    @BeforeMethod (groups = "gp1")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions = new Actions(driver);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formatter);

    }

    @AfterMethod (groups = "gp1")
    public void tearDown() {
        // driver.quit();
    }

}
