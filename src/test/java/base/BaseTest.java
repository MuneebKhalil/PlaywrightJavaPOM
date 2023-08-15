package base;

import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;
import java.util.Properties;


public class BaseTest {
    PlaywrightFactory playwrightFactory;
    Page page;
    Properties properties;
   protected HomePage homePage;
   protected LoginPage loginPage;

    @BeforeTest
    public void setup() throws IOException {
        playwrightFactory = new PlaywrightFactory();
        properties  = playwrightFactory.initProperties();
        page = playwrightFactory.initBrowser(properties);
        homePage = new HomePage(page);
    }
    @AfterTest
    public void tearDown(){
        page.context().browser().close();
    }
}

