package com.org.ita.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchingResultsPage extends BasePage{

    @FindBy(xpath = "//a[@href='/title/tt0088763/?ref_=fn_al_tt_1']")
    public WebElement movieToChoose;

    public SearchingResultsPage(WebDriver driver) {super(driver);}

    public MoviePage clickChosenMovie(){
        movieToChoose.click();
        return new MoviePage(driver);
    }
}
