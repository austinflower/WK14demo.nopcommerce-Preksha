package demo.nopcommerce.com.testsuite;

import demo.nopcommerce.com.pages.ComputerPage;
import demo.nopcommerce.com.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computerPage.getcomputerpage();
        String actualdesktop = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expecteddesktop= "Desktops";
        Assert.assertEquals(actualdesktop,expecteddesktop);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.sortbyaz();
        String actualcom= driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
        String expectedcom ="Build your own computer";
        Assert.assertEquals(actualcom,expectedcom);
        computerPage.buildyourowncomputer();
        String actualprice = driver.findElement(By.xpath("//div[@class='product-price']/span")).getText();
        String expprice = "$1,475.00";
        Assert.assertEquals(actualprice,expprice);
        driver.findElement(By.id("add-to-cart-button-1")).click();
        String actaddtocart = driver.findElement(By.xpath("//div[@class='bar-notification success']/p")).getText();
        String expaddtocart = "The product has been added to your shopping cart";
        Assert.assertEquals(actaddtocart,expaddtocart);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='bar-notification']/div/span")).click();
        computerPage.hoverovershoppingcart();
        String actshopg = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expshopg = "Shopping cart";
        Assert.assertEquals(actshopg,expshopg);
        computerPage.shoppingcart();
        String actupdateprice = driver.findElement(By.xpath("//div[@class='total-info']/table/tbody/tr[4]/td[2]/span/strong")).getText();
        String expupdateprice = "$2,950.00";
        Assert.assertEquals(actupdateprice,expupdateprice);
        computerPage.termsofserviceANDcheckout();
        String actsignin = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expsignin = "Welcome, Please Sign In!";
        Assert.assertEquals(actsignin,expsignin);
        computerPage.checkoutasguest();

        String actualcreditcard = driver.findElement(By.xpath("//div[@class='billing-info-wrap']/div[2]/ul/li/span[2]")).getText();
        String expectedcreditcard ="Credit Card";
        Assert.assertEquals(actualcreditcard,expectedcreditcard);

        String actualshipping = driver.findElement(By.xpath("//li[@class='shipping-method']/span[2]")).getText();
        String expectedshipping ="Next Day Air";
        Assert.assertEquals(actualshipping,expectedshipping);

        String actualcharge =driver.findElement(By.xpath("//table[@class='cart-total']/tbody/tr[4]/td[2]/span/strong")).getText();
        String expectedprice ="$2,950.00";
        Assert.assertEquals(actualcharge,expectedprice);
        computerPage.confirmorder();

        String actualText = driver.findElement(By.xpath("//div[@class='page checkout-page order-completed-page']/div[1]/h1")).getText();
        String expectedText = "Thank you";
        Assert.assertEquals(actualText,expectedText);

        String actualorder = driver.findElement(By.xpath("//div[@class='section order-completed']/div[1]/strong")).getText();
        String expectedorder ="Your order has been successfully processed!";
        Assert.assertEquals(actualorder,expectedorder);
        computerPage.ordercompleted();

        String actualtext = driver.findElement(By.xpath("//div[@class='topic-block-title']/h2")).getText();
        String expectedtext= "Welcome to our store";
        Assert.assertEquals(actualText,expectedText);

    }
}
