package org.example.Task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookDepository {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");
        Thread.sleep(2000);
        WebElement cookiesYes = driver.findElement(By.cssSelector(".cookie-consent-buttons [class*='yes']"));
        cookiesYes.click();
        Thread.sleep(2000);
        By searchGradleButton = By.xpath("//*[@id=\"book-search-form\"]/div[1]/input[1]");
        WebElement searchField = driver.findElement(searchGradleButton);
        searchField.sendKeys("Harry Potter");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"book-search-form\"]/div[1]/button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement selectBook = driver.findElement(By.cssSelector(
                "[class='tab search'] .title"));
        selectBook.click();
        Thread.sleep(2000);
        WebElement addToBasket = driver.findElement(By.cssSelector(
                "body > div.page-slide > div.content-wrap > div > div > div.item-wrap > div.item-block > div.item-tools > div > div.btn-wrap > a.btn.btn-primary.add-to-basket"));
        addToBasket.click();
        Thread.sleep(2000);
        WebElement goToBasket = driver.findElement(By.cssSelector(
                "body > div.modal.fade.status-success.in > div > div > div.modal-body > div > div.basket-info > a.btn.btn-primary.pull-right.continue-to-basket.string-to-localize.link-to-localize"));
        goToBasket.click();
        Thread.sleep(2000);
        WebElement removeFromBasket = driver.findElement(By.cssSelector(
                "body > div.page-slide > div.content-wrap > div > div.basket-items-wrap > div.basket-item > div.item-checkout-info > form.remove-item > button"));
        removeFromBasket.click();
        Thread.sleep(20000);
        driver.quit();
    }
}
