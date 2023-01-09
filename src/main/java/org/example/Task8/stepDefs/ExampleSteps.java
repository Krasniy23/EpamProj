package org.example.Task8.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExampleSteps {

    private final WebDriver driver = new ChromeDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    private String productTitle;

    @Before
    public void openPage() {
        driver.get("https://www.bookdepository.com/");
        try {
            WebElement cookiesYes = driver.findElement(By.cssSelector(".cookie-consent-buttons [class*='yes']"));
            cookiesYes.click();
        } catch (NotFoundException ignored) {
        }
    }

    @And("^in the search field send keys \"(.*)\"$")
    public void sendKeysToSearchField(String value) {
        By searchFieldLocator = By.xpath(
                "//*[@id='book-search-form']/div[1]/input[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchFieldLocator));
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(value);
    }

    @And("^click search button$")
    public void clickSearchButton() {
        By searchButtonLocator = By.xpath(
                "//*[@id='book-search-form']/div[1]/button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButtonLocator));
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    @And("^save first product title$")
    public void saveFirstProductTitle() {
        By productListLocator = By.cssSelector(".item-info .title a");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productListLocator));
        List<WebElement> itemTitles = driver.findElements(productListLocator);
        productTitle = itemTitles.get(0).getText();
    }

    @And("^click add to cart button$")
    public void clickAddToCartButton() {
        By addToBasketButtonLocator = By.xpath(
                "//*[contains(@class,'book-item')]//*[contains(text(),'Add to basket')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToBasketButtonLocator));
        WebElement addToBasket = driver.findElement(addToBasketButtonLocator);
        addToBasket.click();
    }

    @When("^click go to basket button$")
    public void clickGoToBasketButton() {
        By goToBasketButtonLocator = By.cssSelector(
                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToBasketButtonLocator));
        WebElement goToBasket = driver.findElement(goToBasketButtonLocator);
        goToBasket.click();
    }

    @Then("^check product title is equal to saved$")
    public void checkProductTitleIsEqualToSaved() {
        By basketTitleLocator = By.cssSelector(".basket-item .item-info a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(basketTitleLocator));
        String basketTitle = driver.findElement(basketTitleLocator).getText();
        Assert.assertEquals(productTitle, basketTitle);
    }

    @Then("^check all prices are valid$")
    public void checkAllPricesAreValid() {
        By pricesListLocator = By.cssSelector(".sale-price");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pricesListLocator));
        List<WebElement> itemPrices = driver.findElements(pricesListLocator);
        Assert.assertTrue(itemPrices.stream().map(WebElement::getText).map(x -> Double.parseDouble(x.replace(",", ".").substring(0, x.length() - 2)))
                .allMatch(x -> x > 0));
    }

    @After
    public void finishTest() {
        driver.quit();
    }
}