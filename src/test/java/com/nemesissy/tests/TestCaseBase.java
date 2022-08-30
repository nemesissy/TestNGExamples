package com.nemesissy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.nio.file.Paths;

public class TestCaseBase {

    WebDriver driver = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
        System.setProperty("webdriver.chrome.driver",
                Paths.get("/Users/clandry/chromedriver/chromedriver").toString());
        driver = new ChromeDriver();
        driver.get("https://www.amsmeteors.org/");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
