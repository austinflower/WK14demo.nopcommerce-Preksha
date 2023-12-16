package demo.nopcommerce.com.pages;

import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Electronics extends Utility {

    public void text() {

        Actions actions = new Actions(driver);

        WebElement electronics = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        WebElement cellphone = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul/li[2]/a"));
        actions.moveToElement(electronics).moveToElement(cellphone).click().build().perform();
    }
    public void clickonlink() throws InterruptedException {
        clickOnElement(By.xpath("//div[@class='product-viewmode']/a[2]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/h2/a"));
    }
    public void quantity() throws InterruptedException {
        //2.8 Change quantity to 2
        driver.findElement(By.xpath("//div[@class='add-to-cart-panel']/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='add-to-cart-panel']/input")).sendKeys("2");
        //2.9 Click on “ADD TO CART” tab
        clickOnElement(By.xpath("//div[@class='add-to-cart-panel']/button"));
    }
    public void gotocart(){
        driver.findElement(By.xpath("//div[@id='bar-notification']/div/span")).click();
        driver.findElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span[1]")).click();
    }
    public void checkout(){
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        //2.16 Click on checkout
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }
    public void registerinfo(){
        driver.findElement(By.xpath("//button[@class='button-1 register-button']")).click();}

      public void returningcustomer(){
        driver.findElement(By.id("FirstName")).sendKeys("Tom");
        driver.findElement(By.id("LastName")).sendKeys("Smith");
        driver.findElement(By.id("Email")).sendKeys("tomsmith9007@aol.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        //2.21 Click on “REGISTER” Button
        driver.findElement(By.id("register-button")).click();
    }
    public void continuebutton() throws InterruptedException {
        //2.23
        clickOnElement(By.xpath("//div[@class='buttons']/a"));
        Thread.sleep(3000);

    }
    public void extralogin(){
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[2]/a"));
        driver.findElement(By.id("Email")).sendKeys("tomsmith9007@aol.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
    public void mandatoryfield() throws InterruptedException {
        WebElement ddcountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select selectcountry = new Select(ddcountry);
        selectcountry.selectByIndex(1);
        Thread.sleep(1000);
        WebElement state = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select selectstate =new Select(state);
        selectstate.selectByIndex(53);
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Dallas");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 main st");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("1234");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("999-000-9090");
        //2.28 Click on “CONTINUE”

        clickOnElement(By.xpath("//div[@id='billing-buttons-container']/button[4]"));
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        driver.findElement(By.id("shippingoption_2")).click();
        //2.30 Click on “CONTINUE”

        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        //2.31 Select Radio Button “Credit Card”
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/button")).click();
        //2.32 Select “Visa” From Select credit card dropdown
        WebElement pickVisa = driver.findElement(By.id("CreditCardType"));
        pickVisa.click();
        Select svisa = new Select(pickVisa);
        svisa.selectByVisibleText("Visa");
        //2.33 Fill all the details
        driver.findElement(By.id("CardholderName")).sendKeys("Tommy Smith");
        driver.findElement(By.id("CardNumber")).sendKeys("1111 2222 3333 4444");
        WebElement expmonth = driver.findElement(By.id("ExpireMonth"));
        Select smonth = new Select(expmonth);
        smonth.selectByVisibleText("11");
        WebElement expyear = driver.findElement(By.id("ExpireYear"));
        Select syear =new Select(expyear);
        syear.selectByVisibleText("2030");
        driver.findElement(By.id("CardCode")).sendKeys("222");
        //2.34 Click on “CONTINUE”CHECKOUT”

        clickOnElement(By.xpath("//div[@id='payment-info-buttons-container']/button"));

    }
    public void confirmorderbutton (){
        clickOnElement(By.xpath("//div[@id='confirm-order-buttons-container']/button"));
    }
    public void logout(){
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[2]/a"));
    }

}
