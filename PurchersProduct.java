import org.testng.annotations.Test;

import java.io.IOException;

public class PurchersProduct extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private WishListPage wishListPage;
    private AddToCartPage addToCartPage;
    private CheckOutPage checkOutPage;



    @Test
    public void TC6 () throws IOException, InterruptedException {
        homePage = new HomePage(driver);
        loginPage =homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(3000);
        wishListPage = dashboardPage.ClickOn_MyWishlist();
        Thread.sleep(3000);
        addToCartPage = wishListPage.ClickOn_AddToCart();
        Thread.sleep(3000);
        checkOutPage = addToCartPage.ClickOn_CheckOutButton();
        Thread.sleep(3000);
        checkOutPage.Clear_Adress();
        checkOutPage.Sending_Adress("ABC");
        checkOutPage.Clear_City();
        checkOutPage.Sending_City("New York");
        checkOutPage.Sending_State("New York");
        checkOutPage.Clear_zip();
        checkOutPage.Sending_zip("542896");
        checkOutPage.Sending_Country("United States");
        checkOutPage.Clear_telephone();
        checkOutPage.Sending_telephone("12345678");
        checkOutPage.ClickOn_Continue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_Shippingcontinue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_PaymentMethode();
        Thread.sleep(3000);
        checkOutPage.ClickOn_ContinuePayment();
        Thread.sleep(3000);
        checkOutPage.ClickOn_PlaceHolder();
        Thread.sleep(3000);

    }
}
