import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MyOrderPage extends BasePage{

    public MyOrderPage (WebDriver driver) {
        super(driver);
    }

    private By ViewOrder = By.linkText("VIEW ORDER");
    private By Title = By.cssSelector("div[class=\"page-title title-buttons\"]");
    private By PrintOrder = By.linkText("Print Order");

    public void ClickOn_ViewOrder (){
        ClickOn(ViewOrder);
    }
    public String GetTitleOFOrderPage (){
        return GetText(Title);
    }
    public void ClickOnPrintOrder (){
        ClickOn(PrintOrder);
    }




}
