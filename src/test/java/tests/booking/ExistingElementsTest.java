package tests.booking;

import org.junit.Test;
import pages.booking.ElementsPage;
import pages.booking.RegisterUserPage;

public class ExistingElementsTest extends ElementsPage {

    ElementsPage elementsPage = new ElementsPage();

    @Test

    public void existingTest() {

        elementsPage.maximize();
        elementsPage.openStartPage();
        elementsPage.lodgingElement("//span[contains (.,'Жилье')]");


    }

    //hw#?d5ux6Tna.P&   password
}
