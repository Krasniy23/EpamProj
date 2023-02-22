package org.example.Task9.abstractclasses.fragment;

import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {

    private WebElement rootElement;

    public AbstractFragment() {
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }
}
