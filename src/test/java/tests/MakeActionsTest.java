package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeActionsTest {

    WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.w3schools.com/java/");
    }
    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Test

    public void apiActions() {

        WebElement nameField = driver.findElement(By.xpath("//span[contains(.,'Tutorial')]"));
        Actions make = new Actions(driver);
        make
                .doubleClick(nameField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();

        driver.get("https://google.com");

        make
                .click(driver.findElement(By.name("q")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build().perform();

        int numberBlocks = driver.findElements(By.xpath("//div[@class='g']")).size();
        int numberBlocksTutorial = driver.findElements(By.xpath("//div[@class='g' and contains(., 'tutorial')]")).size();

        Assert.assertEquals("Expected number blocks equal number blocks with Tutorial", numberBlocks, numberBlocksTutorial);


    }
}
