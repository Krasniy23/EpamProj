import org.example.Task9.desktop.pages.BasketPage;
import org.example.Task9.desktop.pages.HomePage;
import org.example.Task9.desktop.pages.SearchResultsPage;
import org.example.Task9.driver.SingletonDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookDepositoryPatternsTest {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private BasketPage basketPage;
    private WebDriver driver = new SingletonDriver().getDriver();

    @Before
    public void before() {
        driver.get("https://www.bookdepository.com/");

        try {
            WebElement cookiesYes = driver.findElement(By.cssSelector(".cookie-consent-buttons [class*='yes']"));
            cookiesYes.click();
        } catch (NotFoundException ignored) {
        }
    }

    @Test
    public void checkValidProductWasAdded() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.searchField.sendKeys("Harry Potter");
        homePage.searchButton.click();
        searchResultsPage = new SearchResultsPage(driver);
        String searchTitle = searchResultsPage.itemTitles.get(0).getText();
        searchResultsPage.addToBasket.click();
        Thread.sleep(1000);
        searchResultsPage.goToBasket.click();
        basketPage = new BasketPage(driver);
        String basketTitle = basketPage.basketTitle.getText();
        Assert.assertEquals(searchTitle, basketTitle);
    }

    @Test
    public void checkAllPricesAreValid() {
        homePage = new HomePage(driver);
        homePage.searchField.sendKeys("Harry Potter");
        homePage.searchButton.click();
        searchResultsPage = new SearchResultsPage(driver);
        Assert.assertTrue(
                searchResultsPage.itemPrices.stream().map(WebElement::getText).map(x -> Double.parseDouble(x.replaceAll(" ", "").substring(0, x.length() - 4)))
                        .allMatch(x -> x > 0));
    }

    @After
    public void quit() {
        driver.quit();
    }
}
