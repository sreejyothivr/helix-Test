package com.qburst.testing.automationcore.pagemodels.web.page.objects;

import com.qburst.testing.automationcore.selenium.Element;
import com.qburst.testing.automationcore.selenium.ParentDriver;
import org.openqa.selenium.By;

public class CartPage extends TeslaPage{

    public CartPage(ParentDriver driver) {
        super(driver);
        setLocatorCollection();
    }
    private Element cartButton()
    {
        return getElement("carticon");

    }

    private Element product()
    {
        return getElement("product");
    }

public void clickCartBtn()
{
    cartButton().click();
}

public String productName()
{
   return(product().getText());
}
}
