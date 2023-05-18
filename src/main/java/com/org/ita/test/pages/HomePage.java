package com.org.ita.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchForm;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage enterMovie(String name){
        searchForm.sendKeys(name);
    return  this;
    }
    public SearchingResultsPage clickSearch(){
        searchButton.click();
        return  new SearchingResultsPage(driver);
    }
}