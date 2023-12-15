import lombok.SneakyThrows;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestWithComponents extends TestBase{
    @SneakyThrows
    @Test
    public void wowItWorks(){
        driver.get("http://146.59.32.4/index.php");
        Thread.sleep(1000);

        HomePage homePage = new HomePage(driver);

        homePage.printContactTest();
        homePage.printProductNames();
    }
}
