package Day19.steps;

import Day19.driver.Driver;
import Day19.driver.ThreadSafeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FakeGuiSteps {

    @Given(value = "I go to onliner.by")
    public void checkHeaderTest() {
      ThreadSafeDriver.getWebDriver().get("https://onliner.by");
    }

    @When("I start waiting")
    public void checkFooterTest(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I just passed")
    public void verify(){
        Assert.assertTrue(true);
    }
}
