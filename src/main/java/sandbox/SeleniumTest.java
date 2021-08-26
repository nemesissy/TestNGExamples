package sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class SeleniumTest {

    WebDriver driver = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
        System.setProperty("webdriver.chrome.driver",
                Paths.get("/Users/clandry/chromedriver/chromedriver").toString());
    }

    @Test(enabled=true)
    public void runTest1() {
        System.out.println("runTest1");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

}
