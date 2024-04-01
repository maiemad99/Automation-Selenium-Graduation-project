import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SortingByName extends BaseTest {
    private HomePage homePage;
    private MobilePage mobilePage;

    @Test
    public void sorting()  {
        homePage = new HomePage(driver);
        String Title = homePage.GetingHomePageTitle();
        String expected = "THIS IS DEMO SITE FOR";
        Assert.assertTrue(Title.contains(expected));
        mobilePage = homePage.clickOnMobile();
        String mobTitle =  mobilePage.GetingTitleOfMobilePage();
        String expecteed = "MOBILE";
        Assert.assertTrue(mobTitle.contains(expecteed));
        mobilePage.DropDownByText("Name");

    }






}