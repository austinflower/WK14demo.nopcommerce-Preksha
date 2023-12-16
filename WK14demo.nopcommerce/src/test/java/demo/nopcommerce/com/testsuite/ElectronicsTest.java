package demo.nopcommerce.com.testsuite;

import demo.nopcommerce.com.pages.ComputerPage;
import demo.nopcommerce.com.pages.Electronics;
import demo.nopcommerce.com.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    Electronics electronics =new Electronics();
    ComputerPage computerPage = new ComputerPage();
    @Test
    public void textverified(){
        electronics.text();
        String actualpage = driver.findElement(By.xpath("//div[@class='page category-page']/div[1]/h1")).getText();
        String expectedpage ="Cell phones";
        Assert.assertEquals(actualpage,expectedpage);
    }
        @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.text();
        String actualpage = driver.findElement(By.xpath("//div[@class='page category-page']/div[1]/h1")).getText();
        String expectedpage ="Cell phones";
        Assert.assertEquals(actualpage,expectedpage);
        //2.6 Verify the text “Nokia Lumia 1020”
        electronics.clickonlink();
        String actualproduct = driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
        String expectedproduct ="Nokia Lumia 1020";
        Assert.assertEquals(actualproduct,expectedproduct);
        //2.7 Verify the price “$349.00”

        String actualprice = driver.findElement(By.xpath("//div[@class='overview']/div[5]/div/span")).getText();
        String expectedprice ="$349.00";
        Assert.assertEquals(actualproduct,expectedproduct);
        electronics.quantity();

            Thread.sleep(2000);
            String actualadded = driver.findElement(By.xpath("//div[@class='bar-notification success']/p")).getText();
            String expectedadded ="The product has been added to your shopping cart";
            Assert.assertEquals(actualadded,expectedadded);
            electronics.gotocart();

            String actualshoppingcart = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
            String expectedshoppingcart ="Shopping cart";
            Assert.assertEquals(actualshoppingcart,expectedshoppingcart);


            String actualquantity = driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr/td[5]/input")).getText();
            String expectedquantity ="";
            Assert.assertEquals(actualquantity,expectedquantity);
            //2.14 Verify the Total $698.00

            String actualtotal = driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr/td[6]")).getText();
            String expectedtotal ="$698.00";
            Assert.assertEquals(actualtotal,expectedtotal);
            electronics.checkout();
            String actsignin = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
            String expsignin = "Welcome, Please Sign In!";
            Assert.assertEquals(actsignin,expsignin);
            electronics.registerinfo();

            String actualregister = driver.findElement(By.xpath("//div[@class='page registration-page']/div[1]/h1")).getText();
            String expectedregister = "Register";
            Assert.assertEquals(actualregister,expectedregister);

            electronics.returningcustomer();
            //2.22 Verify the message “Your registration completed”

            String actualregcom = driver.findElement(By.xpath("//div[@class='page-body']/div")).getText();
            String expectedregcom = "Your registration completed";
            Assert.assertEquals(actualregcom,expectedregcom);
            electronics.continuebutton();

            String actualshopcart = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
            String expectedshopcart = "Shopping cart";
            Assert.assertEquals(actualshopcart,expectedshopcart);
            electronics.extralogin();
            electronics.checkout();
            electronics.mandatoryfield();

            String actualcreditcard = driver.findElement(By.xpath("//div[@class='billing-info-wrap']/div[2]/ul/li/span[2]")).getText();
            String expectedcreditcard = "Credit Card";
            Assert.assertEquals(actualcreditcard,expectedcreditcard);

            String actualshippingm = driver.findElement(By.xpath("//li[@class='shipping-method']/span[2]")).getText();
            String expectedshippingm = "2nd Day Air";
            Assert.assertEquals(actualshippingm,expectedshippingm);

            String actualcarttotal = driver.findElement(By.xpath("//table[@class='cart-total']/tbody/tr[4]/td[2]/span/strong")).getText();
            String expectedcarttotal = "$698.00";
            Assert.assertEquals(actualcarttotal,expectedcarttotal);
            electronics.confirmorderbutton();

            String actualcheckout = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
            String expectedcheckout = "Checkout";
            Assert.assertEquals(actualcheckout,expectedcheckout);

            String actualorder = driver.findElement(By.xpath("//div[@class='section order-completed']/div[1]/strong")).getText();
            String expectedorder = "Your order has been successfully processed!";
            Assert.assertEquals(actualorder,expectedorder);
            computerPage.ordercompleted();

            String actualtital = driver.findElement(By.xpath("//div[@class='topic-block-title']/h2")).getText();
            String expectedtital = "Welcome to our store";
            Assert.assertEquals(actualtital,expectedtital);
            electronics.logout();
            String realURL= driver.getCurrentUrl();
            String expectedURL ="https://demo.nopcommerce.com/";
            Assert.assertEquals(realURL,expectedURL);
        }


}
