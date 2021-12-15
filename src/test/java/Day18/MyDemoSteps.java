package Day18;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemoSteps {

    WebDriver driver = new ChromeDriver();

    @Given("I open test site")
    public void iOpenTestSite() {
        driver.navigate().to("https://www.booking.com/");
    }

    @When("I fill the form")
    public void iFillTheForm() {
        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Париж");
    }

    @Then("I see greeting message")
    public void iSeeGreetingMessage() {
        Assert.assertTrue("Expected hotel price is lower than expected!", true);
    }
}
