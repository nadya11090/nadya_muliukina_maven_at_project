package letual;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddToFavouriteTest extends StartPage {

    StartPage startPage = new StartPage();

    @Test
    public void checkFavoriteTest() throws InterruptedException {

        startPage.navigateToStartPage();
        startPage.navigateToProductPage();
        startPage.addToFavourite();
        String sku = driver.findElement(By.xpath(SKU_OF_PRODUCT))
                .getText();
        startPage.openFavouriteList();
        String fav = driver.findElement(By.xpath(SKU_OF_PRODUCT_FAV))
                .getText();
        //Assert.assertEquals();

        //        driver.close();
        //        driver.quit();

    }
}
