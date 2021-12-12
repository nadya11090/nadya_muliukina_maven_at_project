package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptColorTitleTest {
    WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.navigate().to("https://booking.com");
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Test
    public void colorTitleTest() {

        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Москва");
        driver.findElement(By.xpath("//span[contains (.,'Проверить цены')]")).click();

        WebElement tenthElement = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", tenthElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenthElement);

        WebElement title = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]//div[@data-testid='title']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", title);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", title);

        String titleColor = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]//div[@data-testid='title']")).getCssValue("color");

        Assert.assertEquals("Expected color (red) is equal ", "rgba(255, 0, 0, 1)", titleColor);

    }
}
