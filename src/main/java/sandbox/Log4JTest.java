package sandbox;

// Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4JTest {

    private static final Logger logger = LogManager.getLogger(Log4JTest.class);

    public static void main(final String... args) {

        logger.debug("Entering application.");
        logger.debug("Exiting application.");
    }
}