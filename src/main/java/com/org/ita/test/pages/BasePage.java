package com.org.ita.test.pages;
import com.org.ita.test.utils.ElementWait;
import com.org.ita.test.utils.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected  ElementWait wait;
    protected ElementActions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new ElementWait(driver);
        action = new ElementActions(driver);
        PageFactory.initElements(driver, this);
    }

    protected void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}