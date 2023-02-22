package org.example.Task9.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaiter extends WebDriverWait {

    public WebDriverWaiter(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }
}
