package com.solvd.carina.demo.web;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.demo.web.pages.HomePage;
import com.solvd.carina.demo.web.pages.WebDevelopmentPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomeTest extends AbstractTest {

    @Test
    public void EnterHomePage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        WebDevelopmentPage webDevelopmentPage = homePage.clickStepOne();
        assertTrue(webDevelopmentPage.isPageOpened(),"Web Development Page isn't open");
    }

}
