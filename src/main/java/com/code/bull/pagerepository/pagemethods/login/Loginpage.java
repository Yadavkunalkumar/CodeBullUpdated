package com.code.bull.pagerepository.pagemethods.login;

import com.code.bull.pagerepository.pagelocators.LoginpageElement;
import com.code.bull.pagerepository.pagemethods.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BasePage {


    LoginpageElement loginpage;


    public Loginpage(WebDriver driver){
          super(driver);
          loginpage = PageFactory.initElements(driver, LoginpageElement.class);

    }

    /**
     * This method is used to enter text in username field
     *
     * @param userName userName
     */
    public void enterUserName(String userName) throws InterruptedException {
        commonLip.info("Going to enter userName");
        enterText(LoginpageElement.username, userName);
    }

    /**
     * this method is used to enter text in userPass filed
     *
     * @param userPass userPass
     */
    public void enterUserPass(String userPass) throws InterruptedException {
        commonLip.info("Going to enter password");
        enterText(LoginpageElement.userpass, userPass);
    }
    /**
     * This method will return you the current url
     *
     * @return the url
     */
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * This method is used to click on Login Btn
     */
    public void clickLoginBtn() {

        click(LoginpageElement.loginBtn);
    }
}

