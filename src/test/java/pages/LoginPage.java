package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
     Page page;

     public LoginPage(Page page){
         this.page = page;
     }
     private String emailPlaceholder = "#input-email";
     private String passwordPlaceHolder = "#input-password";
     private String loginBtn = "input[type='submit']";
     private String forgotPassword = "div[class='form-group'] a";
     private String logoutBtn = "div[class='list-group'] a:text('Logout')";

     public String getLoginPageTitle(){
         return page.title();
     }
     public boolean isForgotPwdLinkExist(){
         return page.isVisible(forgotPassword);
     }
     public boolean doLogin(String userEmail,String userPassword){
         page.fill(emailPlaceholder,userEmail);
         page.fill(passwordPlaceHolder, userPassword);
         page.click(loginBtn);
         if(page.isVisible(logoutBtn)){
             System.out.println("User is logged in");
             return true;
         }
         return false;
     }
}
