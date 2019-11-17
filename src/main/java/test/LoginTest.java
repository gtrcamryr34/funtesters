package test;

import controller.TestData;
import controller.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LoginScreen;
import pages.SecureAreaScreen;

public class LoginTest extends TestUtilities {

    @Test
    public void Logintest() {
        System.out.println("Starting Login Test");
        //Open Main Page
        HomeScreen homeScreen = new HomeScreen(driver);
        LoginScreen loginPageObject = new LoginScreen(driver);
        SecureAreaScreen secureAreaPage = new SecureAreaScreen(driver);


        homeScreen.openPage();
        homeScreen.clickFormAuth();

        Assert.assertEquals(driver.getCurrentUrl(), loginPageObject.loginPageURL());
        loginPageObject.verifyLoginTitle();
        loginPageObject.Login(TestData.USERNAME, TestData.PASSWORD);

        Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());
    }

    @AfterTest
    public void LogoutTest() {
        String logOutText = "You logged out of the secure area!\n" +
                "×";
        SecureAreaScreen secureAreaPage = new SecureAreaScreen(driver);
        LoginScreen loginPageObject = new LoginScreen(driver);

        secureAreaPage.isLogoutButtonAvailable();
        secureAreaPage.clickLogout();

        Assert.assertEquals(loginPageObject.verifyLogoutMessage(), logOutText);

        driver.close();
    }
}

