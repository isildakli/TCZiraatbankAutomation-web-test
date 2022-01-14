package operations;

import org.apache.log4j.Logger;
import org.junit.Assert;

public class AssertionOperation {

    private String logMessage = "";
    private final Logger log = Logger.getLogger(AssertionOperation.class);

    public void checkEquals(String expectedValue, String actualValue) {

        if (!expectedValue.equals(actualValue)) {
            logMessage = String.format("'%s' and '%s' are not equal!", expectedValue, actualValue);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        logMessage = String.format("'%s' and '%s' are checked whether they are equal or not!", expectedValue, actualValue);
        log.info(logMessage);
    }
}
