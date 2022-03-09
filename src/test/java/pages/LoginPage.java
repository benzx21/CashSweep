package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;
import models.LoginModel;

public class LoginPage {


    Page page = FrameworkConfig.LocalPage;

    String txtUserName = "#username";
    String txtPassword = "#password";
    String btnLogin = "input:text('login-button')";

    public void Login(String userName, String password) {
        page.fill(txtUserName, userName);
        page.fill(txtPassword, password);
        page.click(btnLogin);


    }

    public boolean captureUsernameField(String username) {
     page.fill(txtUserName,username);
        return true;
    }
    public boolean capturePasswordField(String password) {
        page.fill(txtPassword,password);
        return true;
    }
}
