import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BookTests {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.get("https://www.bookdepository.com/");
        try {
            WebElement cookiesYes = driver.findElement(By.cssSelector(".cookie-consent-buttons [class*='yes']"));
            cookiesYes.click();
        } catch (NotFoundException ignored) {
        }
    }

    //    @Test
//    public void checkThatUrlIsValid() throws InterruptedException {
//        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
//        By searchGradleButton = By.xpath(
//                "//*[@id=\"book-search-form\"]/div[1]/input[1]");
//        WebElement searchField = driver.findElement(searchGradleButton);
//        searchField.sendKeys("Harry Potter");
//        WebElement searchButton = driver.findElement(By.xpath(
//                "//*[@id=\"book-search-form\"]/div[1]/button"));
//        searchButton.click();
//        Thread.sleep(2000);
//        WebElement selectBook = driver.findElement(By.cssSelector(
//                "[class='book-item'] .title"));
//        selectBook.click();
//        Thread.sleep(2000);
//        WebElement addToBasket = driver.findElement(By.cssSelector(
//                "[class='btn btn-primary add-to-basket']"));
//        addToBasket.click();
//        Thread.sleep(2000);
//        WebElement goToBasket = driver.findElement(By.cssSelector(
//                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']"));
//        goToBasket.click();
//        Assert.assertEquals(goToBasket, driver.getTitle());
//    }

    @Test
    public void checkValidProductWasAdded() throws InterruptedException {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
        By searchGradleButton = By.xpath(
                "//*[@id='book-search-form']/div[1]/input[1]");
        WebElement searchField = driver.findElement(searchGradleButton);
        searchField.sendKeys("Harry Potter");
        WebElement searchButton = driver.findElement(By.xpath(
                "//*[@id='book-search-form']/div[1]/button"));
        searchButton.click();
        Thread.sleep(2000);
        List<WebElement> itemTitles = driver.findElements(By.cssSelector(".item-info .title a"));
        String searchTitle = itemTitles.get(0).getText();
        WebElement addToBasket = driver.findElement(By.xpath(
                "//*[contains(@class,'book-item')]//*[contains(text(),'Add to basket')]"));
        addToBasket.click();
        Thread.sleep(2000);
        WebElement goToBasket = driver.findElement(By.cssSelector(
                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']"));
        goToBasket.click();
        String basketTitle = driver.findElement(By.cssSelector(".basket-item .item-info a")).getText();
        Assert.assertEquals(searchTitle, basketTitle);
    }

    @Test
    public void checkAllPricesAreValid() throws InterruptedException {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
        By searchGradleButton = By.xpath(
                "//*[@id='book-search-form']/div[1]/input[1]");
        WebElement searchField = driver.findElement(searchGradleButton);
        searchField.sendKeys("Harry Potter");
        WebElement searchButton = driver.findElement(By.xpath(
                "//*[@id='book-search-form']/div[1]/button"));
        searchButton.click();
        Thread.sleep(2000);
        List<WebElement> itemPrices = driver.findElements(By.cssSelector(".sale-price"));
        Assert.assertTrue(itemPrices.stream().map(WebElement::getText).map(x -> Double.parseDouble(x.replaceAll(" ", "").substring(0, x.length() - 4)))
                .allMatch(x -> x > 0));
    }

    @After
    public void quit() {
        driver.quit();
    }
}