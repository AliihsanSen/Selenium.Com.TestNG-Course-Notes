package Tests.Day09_Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class C02_Log4JTest02 {

    private static Logger logger = LogManager.getLogger(C02_Log4JTest02.class.getName());

    @Test
    public void log4jTest1() {

        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG ERROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");
    }
}
