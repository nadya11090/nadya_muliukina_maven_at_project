package tests.booking;

import driver.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.booking.RegisterUserPage;

public class RegisterUserTest extends RegisterUserPage {

    RegisterUserPage registerUserPage = new RegisterUserPage();
    WebDriver driver = Driver.getDriver();

    @Test
    public void registerTest() throws InterruptedException {
        driver.manage().window().maximize();
        registerUserPage.openStartPage();
        registerUserPage.registerButton();
        registerUserPage.enterEmail("nhiuhy@trashmail.fr");
        registerUserPage.clickContinueButton();
        Thread.sleep(500);
        registerUserPage.enterPassword("NadyaMuliukina1");
        registerUserPage.clickAndHold();



        //Assert.assertTrue();
    }

}
