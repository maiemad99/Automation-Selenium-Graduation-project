import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String Email = "maikahlil@maiil.com";
    protected String Password = "Mai123";
    protected String FirstName = "Mai";
    protected String LastName = "khalil";


    @BeforeTest
    @Parameters({"browser","URL"})
    public  void Setup_Browser (String browser, String url) throws Exception {

        driver= new ChromeDriver();
        driver.navigate().to("http://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterTest
    public void quit () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}