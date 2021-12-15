package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.BookingStartPage;

public class RegisterNewTest {

    private BookingStartPage registerPage;

    @Test
    public void registerTest(){
        registerPage.enterEmail("");
        registerPage.clickContinueButton();
      //  Assert.assertTrue();
    }
}
