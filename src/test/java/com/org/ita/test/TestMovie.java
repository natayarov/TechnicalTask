package com.org.ita.test;

import com.org.ita.test.pages.HomePage;
import com.org.ita.test.pages.MoviePage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestMovie extends BaseTestRunner{
 String text = "Marty McFly, a 17-year-old high school student, is accidentally sent 30 years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.";

    @BeforeMethod
    public void setUp() {
        setDriver();
    }

    @Test
 public void movieHasDescription(){
         MoviePage test= new HomePage(driver)
               .enterMovie("Back to the Future")
               .clickSearch()
               .clickChosenMovie();
       Assert.assertTrue(driver.getPageSource().contains(text));
    }

    @AfterSuite
    public void quiteDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
