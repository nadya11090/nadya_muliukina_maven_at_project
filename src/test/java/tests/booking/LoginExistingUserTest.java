package tests.booking;

import org.junit.Test;
import pages.booking.RegisterUserPage;

public class LoginExistingUserTest {

    private RegisterUserPage startPage;

    @Test
    public void loginTest() {
        startPage.enterEmail("");
        startPage.clickContinueButton();
        startPage.enterPassword("");

    }

    //hw#?d5ux6Tna.P&   password
}
