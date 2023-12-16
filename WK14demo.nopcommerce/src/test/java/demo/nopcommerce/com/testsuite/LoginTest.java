package demo.nopcommerce.com.testsuite;

import demo.nopcommerce.com.pages.HomePage;
import demo.nopcommerce.com.pages.LoginPage;
import demo.nopcommerce.com.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {

        homePage.clickOnLoginLink();
        String actualText = loginPage.getWelcomeText();

        String ExpectedText = "Welcome, Please Sign In!";

        Assert.assertEquals(actualText, ExpectedText);
    }

    @Test
    public void userShouldNotLoginWithInValidCredentials() {

        homePage.clickOnLoginLink();

        //driver.findElement(By.id("Email")).sendKeys("codebuster@gmail.com");
        sendTextToElement(By.id("Email"), "codebuster@gmail.com");

        //driver.findElement(By.id("Password")).sendKeys("123456");
        sendTextToElement(By.id("Password"), "123456");

        //driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String actualErrorMsg = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

    }

}
