package com.solvd.carina.demo.web.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



public class HomePage extends AbstractPage {


    @FindBy(xpath = "//*[@id=\"nav260303551\"]/div/div/nav/div[1]/a")
    private ExtendedWebElement menuLabBtn;

    @FindBy(xpath = "//*[@id=\"nav260303551\"]/div/div/nav/div[1]/div/div/div/ul/li[3]/a")
    private ExtendedWebElement listLabBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public WebDevelopmentPage clickStepOne(){
        menuLabBtn.click();
        listLabBtn.click();
        return new WebDevelopmentPage(getDriver());
    }

}
