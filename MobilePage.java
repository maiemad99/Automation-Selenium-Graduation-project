import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MobilePage extends BasePage{

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    //---------------------------------------------------------------------------------------
    private By MobileTitleIcon = By.tagName("h1");
    private By AddTocart_xperia = By.xpath("(//button[@type=\"button\"])[1]");
    private By AddTocart_Iphone = By.xpath("(//button[@type=\"button\"])[2]");
    private By XperiaPrice = By.xpath("(//span[@class=\"price\"])[1]");
    private By XperiaMob = By.xpath("//h2[@class=\"product-name\"]//a[@title=\"Sony Xperia\"]");
    private By DropDown = By.cssSelector("select[title=\"Sort By\"]");

    //-----------------------------------------------------------------------------
    public String GetingTitleOfMobilePage(){
        return GetText(MobileTitleIcon);
    }
    public  AddToCartPage ClickOnAddTocartButton_xperia(){
        ClickOn(AddTocart_xperia);
        return new AddToCartPage(driver);
    }

    public void DropDownByText(String text){
        SelectingDropDownByText(DropDown,text);
    }


}