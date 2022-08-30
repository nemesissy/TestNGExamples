package com.nemesissy.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class VerifyURL extends TestCaseBase {

    final static Logger log = LogManager.getLogger(VerifyURL.class);

    @Test
    public void testVerifyURL() {

        log.debug("testVerifyURL() Start.");

        assertTrue("Failure - URL incorrect", driver.getCurrentUrl().contains("www.amsmeteors.org"));
        log.info("testVerifyURL() passed.");

        log.debug("verifyURL() End.");
    }
}
