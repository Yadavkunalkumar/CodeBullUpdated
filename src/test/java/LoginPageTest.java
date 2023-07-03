import com.code.bull.commonutils.applicationutils.constant.ApplicationConstant;
import com.code.bull.driver.Driver;
import org.testng.annotations.Test;


public class LoginPageTest extends Driver {

    private static final String username = constants.getvalue(ApplicationConstant.USER_NAME);
    private static final String pass = constants.getvalue(ApplicationConstant.USER_PASS);
    private static final String invalidPass = constants.getvalue(ApplicationConstant.USER_INVALID_PASS);

    @Test(priority = 1, description = "TO verify login into portal by entering correctUsername and invalid pass")
    public void loginWithInvalidPass() throws InterruptedException {
        String url = pages.getloginPage().getUrl();
        assertCheck.append(actions.assertEqualsBoolean(url.contains("/login"), true, "Login url Matched", "Login url NOT Matched"));
        pages.getloginPage().enterUserName(username);
        pages.getloginPage().enterUserPass(invalidPass);
        actions.assertAllFoundFailedAssert(assertCheck);
    }

    @Test(priority = 2, description = "To verify login into portal by entering valid username and password")
    public void loginPortalTest() throws InterruptedException {
        String url = pages.getloginPage().getUrl();
        assertCheck.append(actions.assertEqualsBoolean(url.contains("/login"), true, "Login url Matched", "Login url NOT Matched"));
        pages.getloginPage().enterUserName(username);
        pages.getloginPage().enterUserPass(pass);
        pages.getloginPage().clickLoginBtn();
        String url1 = pages.getloginPage().getUrl();
        assertCheck.append(actions.assertEqualsBoolean(url1.contains("/dashboard"), true, "After Login Dashboard url Matched", "After Login Dashboard url NOT Matched"));
        actions.assertAllFoundFailedAssert(assertCheck);
    }


}
