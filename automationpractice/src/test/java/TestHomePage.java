import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends BaseClient{

    String homepageUrl = "http://automationpractice.com/index.php";

    @Test
    public void testdoSomething(){
        String homepageTitle = "My Store";
        this.driver.navigate().to(homepageUrl);
        Assert.assertEquals(this.driver.getTitle(), homepageTitle);

    }


}
