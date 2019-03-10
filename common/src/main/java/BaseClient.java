import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClient {


    WebDriver driver = null;
    String url = null;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "../common/driver/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

    @AfterClass
    public void cleanup(){
    this.driver.quit();
    }

    //define all common/over used web driver methods here AKA helper methods


}

