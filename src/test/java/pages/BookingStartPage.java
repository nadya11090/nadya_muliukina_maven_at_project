package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingStartPage {

    WebDriver driver = new ChromeDriver();

    public String REGISTER_BUTTON = "//span[contains (.,'Зарегистрироваться')]";
    public String INPUT_EMAIL = "//input[@type= 'email']";
    public String CONTINUE_BUTTON = "//span[contains (.,'Продолжить через электронную почту')]";

    public void enterEmail(String email) {
        driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath("//span[contains (.,'Продолжить через электронную почту')]")).click();
    }

}
