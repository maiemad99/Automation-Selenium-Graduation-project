import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChangeorAddProduct extends BaseTest {
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CheckOutPage checkOutPage;
    private AddToCartPage addToCartPage;

    @Test
    public void REORDERING () throws InterruptedException {
        homePage = new HomePage(driver);
        loginPage =homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(3000);
        addToCartPage = dashboardPage.ClickOn_ReorderLink();
        Thread.sleep(3000);
        String OldPrice = addToCartPage.Get_grandprice();
        addToCartPage.ClearQuantityField();
        addToCartPage.WriteQuantity("10");
        addToCartPage.ClickOn_UpdateButton();
        Thread.sleep(3000);
        String NewPrice = addToCartPage.Get_grandprice();
        Assert.assertFalse(OldPrice.contains(NewPrice));
        System.out.println("Grand Total is = " + NewPrice);
        checkOutPage = addToCartPage.ClickOn_CheckOutButton();
        Thread.sleep(3000);
        checkOutPage.ClickOn_ReorderContinue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_Shippingcontinue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_PaymentMethode();
        Thread.sleep(3000);
        checkOutPage.ClickOn_ContinuePayment();
        Thread.sleep(3000);
        checkOutPage.ClickOn_PlaceHolder();
        Thread.sleep(3000);
        String ordernumb = checkOutPage.GetOrderNumber();
        System.out.println("your order number is: " + ordernumb);



    }
}
