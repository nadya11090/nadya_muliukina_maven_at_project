package tests.booking;

import org.junit.Test;
import pages.booking.StartPage;

public class MadridTest extends StartPage {

    StartPage startPage = new StartPage();

    @Test

    public void madridTest() throws InterruptedException {
        startPage.maximize();
        startPage.openStartPage();
        startPage.signInButton();
        startPage.enterEmail("nadya11090@gmail.com");
        startPage.clickContinueButton();
        Thread.sleep(500);
        startPage.enterPassword("hw#?d5ux6Tna.P&");

        startPage.choiceCity("Мадрид");
        startPage.choiceDates("5","9");

    }

}
