package pages.booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    public static final String BOOKING_START_PAGE = "https://booking.com";
    public static final String CITY_INPUT_FIELD = "//input[@type = 'search']";
    public static final String DATE_SELECTOR_FIELD = "//div[@class = 'xp__dates xp__group']";
    public static final String DATE_IN_CALENDAR = "//td[@data-date = '%s']";
    public static final String GUEST_ROOMS_SELECTOR = "//span[@class = 'xp__guests__count']";
    public static final String PLUS_MINUS = "//button[@aria-label = '%s number of %s']";
    public static final String CLOSE_ALL_POPUPS = "//span[contains(.,'and much more')]";
    public static final String SUBMIT_BUTTON = "//button[@data-sb-id='main']";
    public static final String REGISTER_BUTTON = "//span[contains(.,'Register')]";

    WebDriver driver = Driver.getDriver();

    public void openStartPage() {
        driver.navigate().to(BOOKING_START_PAGE);
    }

    public void findCity(String city){
        //driver.findElement(By.xpath())
    }


}
