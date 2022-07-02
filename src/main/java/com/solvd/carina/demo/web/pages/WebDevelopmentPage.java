package com.solvd.carina.demo.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WebDevelopmentPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"rec266959067\"]/div[1]/div[2]/div[1]/div/div/div[1]")
    private ExtendedWebElement stepOneProgram;

    public WebDevelopmentPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isPageOpened(){
        return stepOneProgram.isElementPresent();
    }


}
