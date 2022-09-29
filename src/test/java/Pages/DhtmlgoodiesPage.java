package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DhtmlgoodiesPage {

    public DhtmlgoodiesPage() {

        PageFactory.initElements(Driver.getDriver(), this);

        /*
        ==> PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
        yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir
        Page object model konseptidir.

        ==> Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
        @FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
        locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
        locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
        kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
        anlayabilmek için önemlidir, okunaklı olmalıdır.
         */
    }

    // Capitals

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy (xpath = "//div[@id='box4']")
    public WebElement copanhagen;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoul;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement rome;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;


    // Countries

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement Norway;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement Sweden;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement UnitedStates;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement Denmark;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement SouthKorea;

    @FindBy(xpath = "//div[@id='box106']")
    public WebElement Italy;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement Spain;
}

