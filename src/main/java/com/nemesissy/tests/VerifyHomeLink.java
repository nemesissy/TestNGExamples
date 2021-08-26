package com.nemesissy.tests;

import com.nemesissy.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class VerifyHomeLink {

    final static Logger log = LogManager.getLogger(VerifyHomeLink.class);
    WebDriver driver = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
        System.setProperty("webdriver.chrome.driver",
                Paths.get("/Users/clandry/chromedriver/chromedriver").toString());
        driver = new ChromeDriver();
        driver.get("https://www.amsmeteors.org/");
    }

    @Test
    public void testVerifyHomeLink() {

        log.debug("testVerifyHomeLink() Start.");

        Home home = new Home(driver);
        home.clickHomeLink();
        log.info("testVerifyHomeLink() passed.");

        log.debug("verifyURL() End.");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
