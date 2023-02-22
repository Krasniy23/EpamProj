package org.example.Task9.desktop.pages;

import org.example.Task9.abstractclasses.page.AbstractPage;
import org.example.Task9.desktop.fragments.NavigateBarFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    private WebDriver driver;

    public NavigateBarFragment navigateBar;

    @FindBy(xpath = "//*[@id='book-search-form']/div[1]/input[1]")
    public WebElement searchField;

    @FindBy(xpath = "//*[@id='book-search-form']/div[1]/button")
    public WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
