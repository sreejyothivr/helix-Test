package com.qburst.testing.automationcore.pagemodels.web.page.objects;

import com.qburst.testing.automationcore.pagemodels.web.page.BasePage;
import com.qburst.testing.automationcore.selenium.Element;
import com.qburst.testing.automationcore.selenium.ElementImpl;
import com.qburst.testing.automationcore.selenium.ParentDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The page elements are maintained here
 */
public class TeslaPage extends BasePage {


    String model3MenuItem = "//a[@title='Model 3']/span";

    String safteyParagraph = "(//strong[contains(text(),'5-Star Rating')]/..)[1]";


    String enterid = "//input[@id='stockNotificationInputFieldDesktop']";

    String emailmetext = "(//a[@class='tds-link tds-link--primary stock-notification-link'])[1]";




    public TeslaPage(ParentDriver driver) {
        super(driver);
        setLocatorCollection();
    }



    private Element buynowbutton() { //return driver.findElement(By.xpath(buynow));
        return getElement("buynow");
    }

    private Element logo()
    {

        return getElement("logoo");
    }


    private Element shopButton()
    {
        return getElement("shopbutton");
    }

    private Element modelSMenuItem() { return getElement("modelSMenuItem");    }

    private Element solarPanelMenuItem(){
        return getElement("solarPanelMenuItem");
    }


    private Element charging()
    {
        return getElement("charging");
    }

    private Element outOfstock()
    {
        return getElement("outofStock");
    }

    private Element outOfStockText()
    {
        return getElement("outofStockText");
    }
    public void clickmodelSMenuItem()
    {
        modelSMenuItem().click("click modelsMenuItem");
    }
    public void clickBuyNowButton()
    {
        buynowbutton().click("click buynow button");
    }

    public void clickShopBtn()
    {
        shopButton().click("clickshopbtn");
    }

    public void clickLogoBtn()
    {
        logo().click();
    }

    public Element model3MenuItem(){
        return driver.findVisibleElement(By.xpath(model3MenuItem));
    }

    public Element safteyParagraph(){
        try {
            return driver.findClickableElement(By.xpath(safteyParagraph));
        }catch (TimeoutException e){
            return driver.findPresentElement(By.xpath(safteyParagraph));
        }
    }



    public String emailmeoutOfStockText()
    {
             return(outOfStockText().getText());

    }

    public void clickChargingText()
    {
        charging().click("click on chargingelement");
    }
    public Element emailMe()
    {
        return(driver.findElement(By.xpath(emailmetext)));
    }
    public Element enterId()
    {
        return driver.findElement(By.xpath(enterid));
    }
    public void  clickSolarPanelMenuItem(){
        solarPanelMenuItem().click();
    }

    public void clickOutofstockitem()
    {
        outOfstock().click("clickon first outofstock item");

    }


}