package mytest.example.au.page;

import mytest.example.au.base.ExtendedPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by pc on 10/12/17.
 */
public class LoginPage extends ExtendedPage {
    private String userName;
    private String passWord;
    private String submit = "login";

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public LoginPage(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    @Override
    public void init(){
        setTextBoxWithName("userName",getUserName());
        setTextBoxWithName("password",getPassWord());
    }
}
