package com.qburst.testing.automationcore.pagemodels.web.page.objects;

import com.qburst.testing.automationcore.selenium.Element;
import com.qburst.testing.automationcore.selenium.ParentDriver;
import org.openqa.selenium.By;

public class InventoryPage extends TeslaPage{
    String selectWithinDropdown=("//select[@name='range']");
    public InventoryPage(ParentDriver driver) {
        super(driver);
        setLocatorCollection();
    }
    //Function for dropdownelements
    private Element  dropDownElements()
    {
        //return(driver.findElement(By.xpath(selectWithinDropdown)));
        return getElement("selectWithinDropdown");

    }

    public void selectDropDownElements(int i)
    {
        dropDownElements().selectByIndex(i);
    }

    public String selectedOption()
    {
        return(dropDownElements().getFirstSelectedOption());
    }
    //commenting



}
