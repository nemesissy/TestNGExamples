package com.nemesissy.tests;

import com.nemesissy.pages.Home;
import com.nemesissy.pages.Article;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class VerifyResults extends TestCaseBase {

    final static Logger log = LogManager.getLogger(VerifyResults.class.getName());

    @Test
    public void testVerifyResults() {

        log.info("testVerifyResults() Start.");

        Home home = new Home(driver);
        home.searchForSomething("fireball");
        home.selectArticle(0);

        Article a = new Article(driver);

        log.info("Article date ["+a.getCalendarText()+"]");
        log.info("Article author ["+a.getAuthor()+"]");

        assertTrue("Failed - article has incorrect date.", a.getCalendarText().contains("MAR\n22\n2021"));
        assertTrue("Failed - article has incorrect author.", a.getAuthor().contains("Vincent Perlerin"));

        log.info("testVerifyResults() passed.");
        log.info("testVerifyResults() End.");

    }
}
