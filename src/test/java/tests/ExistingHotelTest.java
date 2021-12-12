package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BookingSteps;

public class ExistingHotelTest extends BookingSteps {

@Test
    public void hotelFree(){

    driver.findElement(By.xpath(page.searchPlaceInput)).sendKeys("Москва");
    driver.findElement(By.xpath(page.calendarRange)).click();
    driver.findElement(By.xpath(String.format("//td[@data-date='%s']", this.getDateString(0)) )).click();
    driver.findElement(By.xpath(String.format("//td[@data-date='%s']", this.getDateString(7)) )).click();
    driver.findElement(By.xpath(page.checkPricesButton)).click();

    WebElement element = new WebDriverWait(driver, 1000).until(
            ExpectedConditions.elementToBeClickable (By.xpath("//a[contains(text(), 'сначала самая низкая')]")));
    element.click();

    WebElement element1 = driver.findElement(By.xpath("//div[@data-testid='property-card'][1]"));

    Assert.assertTrue(element1.isDisplayed());
}
}


