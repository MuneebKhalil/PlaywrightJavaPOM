package pages;
import com.microsoft.playwright.*;
public class HomePage {

    Page page;

    public HomePage(Page page){
        this.page = page;
    }
    private String search = "input[name='search']";
    private String searchIcon = "div#search button";
    private String searchPageHeader = "div#content h1";
    private String myAccountNavBtn = "span:text('My Account')";
    private String loginLink = "a:text('Login')";

    public String getHomePageTitle() {
        return  page.title();
    }
    public String getHomePageURL() {
        return page.url();
    }
    public String doSearch(String productName){
        page.fill(search, productName);
        page.click(searchIcon);
        page.locator(searchPageHeader).waitFor();
        return  page.textContent(searchPageHeader);
    }
    public LoginPage navigateToLoginPage(){
        page.click(myAccountNavBtn);
        page.click(loginLink);
        return new LoginPage(page);
    }

}
