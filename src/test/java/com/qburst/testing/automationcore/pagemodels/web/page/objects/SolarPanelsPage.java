package com.qburst.testing.automationcore.pagemodels.web.page.objects;

import com.qburst.testing.automationcore.selenium.Element;
import com.qburst.testing.automationcore.selenium.ParentDriver;
import org.openqa.selenium.By;

import java.util.List;

public class SolarPanelsPage extends TeslaPage{

    public SolarPanelsPage(ParentDriver driver) {
        super(driver);
        setLocatorCollection();
    }
    private Element solarPanelHeading() {
        return getElement("solarPanelHeading");
    }

    private Element solarPanelSubHeading() {
        return getElement("solarPanelSubHeading");
    }

    public String getSolarPanelSubHeading() {
        return solarPanelSubHeading().getText();
    }

    public String getSolarPanelHeading()
    {
        return solarPanelHeading().getText();
    }
}
