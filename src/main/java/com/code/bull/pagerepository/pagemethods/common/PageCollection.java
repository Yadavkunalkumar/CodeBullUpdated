package com.code.bull.pagerepository.pagemethods.common;

import com.code.bull.pagerepository.pagemethods.dashboard.DashboardPage;
import com.code.bull.pagerepository.pagemethods.login.Loginpage;
import org.openqa.selenium.WebDriver;

public class PageCollection {

    private static WebDriver driver;

    public PageCollection(WebDriver driver){

        this.driver = driver;
    }
    public Loginpage getloginPage(){
        return new Loginpage(driver);
    }
    public DashboardPage getDashboardPage() {
        return new DashboardPage(driver);

    }

    public Loginpage getLoginPage() {
        return new Loginpage(driver);
    }
}
