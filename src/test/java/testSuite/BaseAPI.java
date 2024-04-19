package testSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static RestSpec.RequestSpec.requestInitialCall;
import static org.testng.Assert.assertNotNull;

public class BaseAPI {

    @BeforeTest(alwaysRun = true, description = "setUp")
    public void setUp() {
        assertNotNull(requestInitialCall());
    }

    @AfterTest(description = "cleanUp")
    public void cleanUp() {

    }
}
