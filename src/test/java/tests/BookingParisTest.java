package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import steps.PreviousBookingSteps;

import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class BookingParisTest extends PreviousBookingSteps {

    @Test
    public void dateCheckTest() throws InterruptedException {

        driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("Париж");
        driver.findElement(By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']")).click();
        driver.findElement(By.xpath(String.format("//td[@data-date='%s']", this.getDateString(3)) )).click();
        driver.findElement(By.xpath(String.format("//td[@data-date='%s']", this.getDateString(10)) )).click();
        driver.findElement(By.xpath("//*[@id='xp__guests__toggle']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//span[contains (.,'Проверить цены')]")).click();
        driver.findElement(By.xpath("//input[@id='__bui-6']/ancestor::label//div[contains(text(), '+')]")).click();

        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));

        driver.findElement(By.xpath("//a[@data-type='price']")).click();

        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));

        String fullText = driver.findElement(By.xpath("//div[@id='search_results_table']//div[@data-testid='property-card'][1]//div[@data-testid='price-and-discounted-price']/span[1]"))
                .getText();
        System.out.println(fullText);
        String priceText = Arrays.stream(fullText.split("BYN")).skip(1).findFirst().get().trim().replace(" ", "");
        System.out.println(priceText);
        int actualPrice = Integer.parseInt(priceText.replaceAll("\\D", ""));

        WebElement filterPrice = driver.findElement(By.xpath("//div[@id='searchboxInc']//div[@data-filters-group='pri']//div[contains(text(), '+')]")); // find filter price
        int expectedMaxPrice = Integer.parseInt(filterPrice.getText().replaceAll("\\D+", "")); //parse to int
        filterPrice.click(); // apply filterprice

        System.out.println("Expected price: " + expectedMaxPrice);
        System.out.println("Actual price: " + actualPrice / 7);
        Assert.assertTrue("Expected hotel price is lower than expected!", actualPrice / 7 >= expectedMaxPrice);


    }
}
