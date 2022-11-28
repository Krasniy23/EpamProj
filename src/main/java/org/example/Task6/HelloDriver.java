package org.example.Task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.6.0");
        By searchGradleButton = By.xpath("/html/body/div/main/div[1]/div[3]/ul/li[2]/a");
        WebElement searchButton = driver.findElement(searchGradleButton);
        searchButton.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
