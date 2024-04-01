import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.Set;

public class SaveOrder extends BaseTest {
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private MyOrderPage myOrdersPage;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Dawnload_PDF() throws InterruptedException{
        homePage = new HomePage(driver);
        loginPage = homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(3000);
        myOrdersPage = dashboardPage.ClickOn_MyOrders();
        myOrdersPage.ClickOn_ViewOrder();
        Thread.sleep(3000);

        String title = myOrdersPage.GetTitleOFOrderPage();
        String expected = "Pending";
        softAssert.assertTrue(title.contains(expected));
        String Main = driver.getWindowHandle();
        myOrdersPage.ClickOnPrintOrder();
        Set<String> windows = driver.getWindowHandles();
        for (String n : windows) {

            if (!n.equals(Main)) {
                driver.switchTo().window(n);
            }
        }
    }
}