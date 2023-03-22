package com.qburst.testing.automationcore.pagemodels.web.page.objects;

import com.qburst.testing.automationcore.selenium.Element;
import com.qburst.testing.automationcore.selenium.ParentDriver;
import org.openqa.selenium.By;

public class ShopPage extends TeslaPage{


    public ShopPage(ParentDriver driver) {
        super(driver);
        setLocatorCollection();
    }

    public String addeddProducttext()
    {
        String x=fisrtProduct().getText();
        return x;
    }

    public void clickFirstProduct()
    {
        fisrtProduct().click("click firstproduct");
    }

    public void clickAddToCartBtn()
    {
        addToCartButton().click();
    }
    private Element fisrtProduct()
    {
        return getElement("firstproduct");
    }



    private Element addToCartButton() { return getElement("addtocart"); }

}
