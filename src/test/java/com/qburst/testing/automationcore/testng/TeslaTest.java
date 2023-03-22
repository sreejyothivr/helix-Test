package com.qburst.testing.automationcore.testng;

import com.qburst.testing.automationcore.pagemodels.web.page.objects.*;
import io.percy.selenium.Percy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeslaTest extends BaseTest {



    @Test()
    public void redirectiontohomepage3() {
        String actual = "http://tesla.com";
        Percy percy = new Percy(driver.getDriver());
        TeslaPage teslaPage = new TeslaPage(driver);
        driver.navigate(teslaPage.getURL());
        percy.snapshot("Homepage");
        String actualurl = driver.getCurrentUrl();
        teslaPage.clickmodelSMenuItem();
        percy.snapshot("Modelpage");
        teslaPage.clickLogoBtn();
        String expectedurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "Navigate back function is not working");
        driver.staticWait(1500);
    }


    @Test(testName = "OutofStock-item restock test validation", description = "Validation of dropdown value selection")
    public void outofStockitemValidation() throws InterruptedException {
        TeslaPage teslaPage = new TeslaPage(driver);
        driver.navigate(teslaPage.getURL());
        teslaPage.clickShopBtn();
        driver.staticWait(1500);
        teslaPage.clickChargingText();
        driver.staticWait(1500);
        teslaPage.clickOutofstockitem();
        driver.staticWait(1500);
        String actual=teslaPage.emailmeoutOfStockText();
       String expected="Email me when this item is restocked";
        driver.staticWait(1500);
        Assert.assertEquals(actual,expected,"Text is not present for the outofstock product");



}


}
