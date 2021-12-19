package Day19.steps;

import Day19.driver.Config;
import Day19.driver.Driver;
import Day19.driver.ThreadSafeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import java.rmi.Remote;


public class FakeBaseSteps {

    private static final Logger LOGGER = LogManager.getLogger(FakeBaseSteps.class);

    @Before
    public void beforeTest() {
        LOGGER.info("Initializing WebDriver..");
        ThreadSafeDriver.setConfig(Config.REMOTE);
    }

    @After
    public void afterTest(){
        LOGGER.info("Killing WebDriver");
        ThreadSafeDriver.destroy();
    }
}
