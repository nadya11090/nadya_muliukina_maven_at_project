package pages.booking;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterUserPage {

    public static final String BOOKING_START_PAGE = "https://booking.com";
    public static final String REGISTER_BUTTON = "//span[contains (.,'Зарегистрироваться')]";
    public static final String INPUT_EMAIL = "//input[@type= 'email']";
    public static final String CONTINUE_BUTTON = "//span[contains (.,'Продолжить через электронную почту')]";
    public static final String PASSWORD_FIELD = "//div[@class='password-input-container bui-spacer--large'][1]//input[@type='password']";
    public static final String INPUT_PASSWORD = "//div[@class='password-input-container bui-spacer--large'][1]//input[@type='password']";
    public static final String CONFIRMED_PASSWORD = "//div[@class='password-input-container bui-spacer--large'][2]//input[@type='password']";
    public static final String CREATE_ACC = "//span[contains (.,'Создать аккаунт')]";
    public static final String CLICK_AND_HOLD = "";

    WebDriver driver = Driver.getDriver();

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void openStartPage() {
        driver.navigate().to(BOOKING_START_PAGE);
    }

    public void registerButton() {
        driver.findElement(By.xpath(REGISTER_BUTTON)).click();
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(PASSWORD_FIELD)).click();
        driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(password);
        driver.findElement(By.xpath(CONFIRMED_PASSWORD)).sendKeys(password);
        driver.findElement(By.xpath(CREATE_ACC)).click();
    }

    public void clickAndHold(){
        driver.findElement(By.xpath(CLICK_AND_HOLD));

        Actions actions = new Actions(driver);
        actions.clickAndHold().perform();
    }
}


