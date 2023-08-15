package tests;

import base.BaseTest;
import base.Constatns;
import factory.PlaywrightFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.microsoft.playwright.*;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {


    @Test
    public void homePageTitleTest() {
        String title = homePage.getHomePageTitle();
        Assert.assertEquals(title, Constatns.HOME_PAGE_TITLE);
    }

    @Test
    public void searchResult() {
        String searchResult = homePage.doSearch("macbook");
        Assert.assertEquals(searchResult, "Search - macbook");
    }

}
