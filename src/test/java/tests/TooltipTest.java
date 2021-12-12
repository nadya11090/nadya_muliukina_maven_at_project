package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

    WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.navigate().to("https://booking.com");
    }

   // @After
    //public void after() {
      // driver.close();
      // driver.quit();
    //}

    @Test

    public void tooltip(){

        WebElement element = driver.findElement(By.xpath("//button[@data-modal-aria-label='Выберите валюту']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        Assert.assertEquals("Incorrect text Tooltip Currency ","Выберите валюту" , driver.findElement(By.xpath("//div[@class= 'bui-tooltip__content']")).getText());

        element = driver.findElement(By.xpath("//div[@class='bui-avatar bui-avatar--small']"));

        actions.moveToElement(element);
        actions.perform();

        Assert.assertEquals("Incorrect text Tooltip Language ", "Выберите язык", driver.findElement(By.xpath("//div[@class= 'bui-tooltip__content']")).getText());
    }

}
