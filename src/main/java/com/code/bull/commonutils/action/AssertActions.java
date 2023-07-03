package com.code.bull.commonutils.action;



import com.code.bull.commonutils.commonLib.CommonLip;
import com.code.bull.driver.Driver;
import org.testng.Assert;

public class AssertActions extends Driver {
    public static Boolean assertFlag = null;


    public Boolean assertEqualsBoolean(boolean actual, boolean expected) {
        return assertEqualsBoolean(actual, expected, "", "");
    }

    public Boolean assertEqualsBoolean(boolean actual, boolean expected, String passDesc, String failDesc) {
        assertFlag = false;
        CommonLip commonLib;
        commonLib = new CommonLip();
        try {
            Assert.assertEquals(actual, expected);
            assertFlag = true;
            commonLib.info("Message :- " + passDesc);
        } catch (Exception ex) {
            commonLib.error(ex.getMessage() + "Message :-" + failDesc);
        }
        return assertFlag;
    }

    public Boolean assertEqualsString(String actual, String expected) {
        return assertEqualsString(actual, expected, "", "");
    }

    public Boolean assertEqualsString(String actual, String expected, String passDesc, String failDesc) {
        assertFlag = false;

        CommonLip commonLib = new CommonLip();
        try {
            Assert.assertEquals(actual, expected);
            assertFlag = true;
            commonLib.info("Message :- " + passDesc);
        } catch (Exception ex) {
            commonLib.error(ex.getMessage() + "Message :-" + failDesc);
        }
        return assertFlag;
    }

    public void assertAllFoundFailedAssert(StringBuilder assertResults) {
        // ACTION PENDING - REQUIRE TO CALL THIS TO @AFTERMETHOD

        CommonLip commonLib= new CommonLip();
        if (assertResults.toString().equals("") || assertResults.toString().contains("false")) {
            Assert.fail("Some Assertions failed in this testcase");
        } else
            commonLib.info("All Assertion Verified and are Passed");
    }
}

