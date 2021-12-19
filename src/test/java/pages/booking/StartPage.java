package pages.booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    public static final String BOOKING_START_PAGE = "https://booking.com";
    public static final String SIGN_IN_BUTTON = "//span[contains (.,'Войти в аккаунт')]";
    public static final String INPUT_EMAIL = "//input[@type= 'email']";
    public static final String CONTINUE_BUTTON = "//span[contains (.,'Продолжить через электронную почту')]";
    public static final String INPUT_PASSWORD = "//div[@class='password-input-container bui-spacer--large']//input[@type='password']";
    public static final String SUBMIT_BUTTON = "//button[@type='submit']";
    public static final String CITY_INPUT_FIELD = "//input[@type = 'search']";
    public static final String DATE_FIELD = "//div[@class = 'xp__dates xp__group']";
    public static final String DATE_IN_CALENDAR = "//td[@data-date = '%s']";
    public static final String GUEST_ROOMS_SELECTOR = "//span[@class = 'xp__guests__count']";
    public static final String PLUS_MINUS = "//button[@aria-label = '%s number of %s']";
    public static final String CLOSE_ALL_POPUPS = "//span[contains(.,'and much more')]";


    WebDriver driver = Driver.getDriver();

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void openStartPage() {
        driver.navigate().to(BOOKING_START_PAGE);
    }

    public void signInButton() {
        driver.findElement(By.xpath(SIGN_IN_BUTTON)).click();
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(password);
        driver.findElement(By.xpath(SUBMIT_BUTTON)).click();
    }

    public void choiceCity(String city) {
        driver.findElement(By.xpath(CITY_INPUT_FIELD)).sendKeys(city);
    }

    public void choiceDates(String dateIn, String dateOut) {
        driver.findElement(By.xpath(DATE_FIELD)).click();
        driver.findElement(By.xpath(String.format(DATE_IN_CALENDAR, dateIn))).click();
        driver.findElement(By.xpath(String.format(DATE_IN_CALENDAR, dateOut))).click();
    }


}











