package letual;

import Day19.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver = Driver.getWebDriver();

    public static final String START_PAGE_LINK = "https://www.21vek.by/"; //"https://www.letu.by";
    public static final String SEARCH_FIELD = "//*[@id='catalogSearch']"; //"//button[contains(text(), 'Каталог')]";
    public static final String FIND_FIRST = "//div[@class= 'ProductItem_productItem__2hT2Q'][1]";
    public static final String HEART_PDP_ICON = "//a[contains(@href,'/aside/?item=6825030')]";
    public static final String FAVOURITE_LIST = "//div[contains(text(), 'Избранные товары')]";
    public static final String SKU_OF_PRODUCT = "//span[@class = 'g-code'][1]";
    public static final String SKU_OF_PRODUCT_FAV = "//span[@class = 'g-code']";
    public static final String ACCOUNT_ICON = "//span[@class = 'userToolsText']";

    public void navigateToStartPage() {
        driver.navigate().to(START_PAGE_LINK);
    }

    public void navigateToProductPage() {
        driver.findElement(By.xpath(SEARCH_FIELD)).sendKeys("ноутбук");
        driver.findElement(By.xpath(FIND_FIRST)).click();
    }

    public void addToFavourite() {
        driver.findElement(By.xpath(HEART_PDP_ICON)).click();
    }

    public void openFavouriteList() {
        driver.findElement(By.xpath(ACCOUNT_ICON)).click();
        driver.findElement(By.xpath(FAVOURITE_LIST)).click();
    }

}
