package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoQaTest {

    WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/select-menu");
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Test
    public void demoQaTest() {

        driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 2')]")).click();
        driver.findElement(By.xpath("//div[@id = 'selectOne']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Mr.')]")).click();

        WebElement element = driver.findElement(By.xpath("//select[@id = 'oldSelectMenu']"));
        Select select = new Select(element);
        select.selectByVisibleText("Voilet");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");

        driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Red')]")).click();

        WebElement elem = driver.findElement(By.xpath("//select[@id = 'cars']"));
        select = new Select(elem);
        select.selectByValue("volvo");

    }

}
