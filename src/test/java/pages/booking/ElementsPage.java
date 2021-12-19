package pages.booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class ElementsPage {

    public static final String BOOKING_START_PAGE = "https://booking.com";
    public static final String LODGING_BUTTON = "//span[contains (.,'Жилье')]";


    WebDriver driver = Driver.getDriver();

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void openStartPage() {
        driver.navigate().to(BOOKING_START_PAGE);
    }

    public boolean lodgingElement(String xpath) {
        try {
            driver.findElement(By.xpath(LODGING_BUTTON));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
