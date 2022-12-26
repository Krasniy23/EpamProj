import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTests {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.get("https://www.bookdepository.com/");
    }

    @Test
    public void checkThatUrlIsValid() {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
        By searchGradleButton = By.xpath(
                "//*[@id=\"book-search-form\"]/div[1]/input[1]");
        WebElement searchField = driver.findElement(searchGradleButton);
        searchField.sendKeys("Harry Potter");
        WebElement searchButton = driver.findElement(By.xpath(
                "//*[@id=\"book-search-form\"]/div[1]/button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement selectBook = driver.findElement(By.cssSelector(
                "[class='book-item'] .title"));
        selectBook.click();
        Thread.sleep(2000);
        WebElement addToBasket = driver.findElement(By.cssSelector(
                "[class='btn btn-primary add-to-basket']"));
        addToBasket.click();
        Thread.sleep(2000);
        WebElement goToBasket = driver.findElement(By.cssSelector(
                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']"));
        goToBasket.click();
        Assert.assertEquals(goToBasket, driver.getTitle());
    }

    @After
    public void quit() {
        driver.quit();
    }
}