package demo.nopcommerce.com.pages;

import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComputerPage extends Utility {



    public void getcomputerpage(){
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a"));
        clickOnElement(By.xpath("//div[@class='item-grid']/div[1]/div/h2/a"));
        WebElement sortByPosition = driver.findElement (By.name("products-orderby"));
        sortByPosition.click();
        Select select =new Select(sortByPosition);
        select.selectByIndex(2);

    }
    public void sortbyaz() throws InterruptedException {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a"));
        clickOnElement(By.xpath("//div[@class='item-grid']/div[1]/div/h2/a"));
        WebElement sortByPosition = driver.findElement (By.name("products-orderby"));
        sortByPosition.click();
        Select select =new Select(sortByPosition);
        select.selectByIndex(1);
        selectByVisibleTextFromDropDown(By.name("products-orderby"), "Name: A to Z");
        clickOnElement(By.xpath("//div[@class='product-grid']/div/div[1]/div/div[2]/div[3]/div[2]/button[1]"));
        Thread.sleep(3000);
    }
    public void buildyourowncomputer () throws InterruptedException {
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        WebElement sortbyghz = driver.findElement(By.id("product_attribute_1"));
        sortbyghz.click();
        Select s2 = new Select(sortbyghz);
        s2.selectByIndex(1);
        //2.7.Select "8GB [+$60.00]" using Select class.
        WebElement sortbyram = driver.findElement(By.id("product_attribute_2"));
        sortbyram.click();
        Select s3 = new Select(sortbyram);
        s3.selectByIndex(3);
        //2.8 Select HDD radio "400 GB [+$100.00]"
        driver.findElement(By.id("product_attribute_3_7")).click();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        driver.findElement(By.id("product_attribute_4_9")).click();
        //A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        driver.findElement(By.id("product_attribute_5_12")).click();
        Thread.sleep(1000);
    }
    public void hoverovershoppingcart (){
        //mouseHoverToElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span[1]"));
        //mouseHoverToElementAndClick(By.xpath("//div[@class='header-upper']/div[2]/div[2]/div[1]/div[4]"));
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[4]/a/span[1]"));

    }
    public void shoppingcart (){
        driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr/td[5]/input")).clear();
        driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr/td[5]/input")).sendKeys("2");
        driver.findElement(By.id("updatecart")).click();
    }
    public void termsofserviceANDcheckout (){
        driver.findElement(By.id("termsofservice")).click();
        //2.19 Click on “CHECKOUT”
        driver.findElement(By.id("checkout")).click();
    }
    public void checkoutasguest() throws InterruptedException {
        clickOnElement(By.xpath("//div[@class='customer-blocks']/div[1]/div[3]/button[1]"));
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Tom");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Smith");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("tomsmith88@aol.com");
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
        clickOnElement(By.xpath("//div[@id='billing-buttons-container']/button[4]"));
        driver.findElement(By.id("shippingoption_1")).click();
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/button")).click();

        WebElement pickMC = driver.findElement(By.id("CreditCardType"));
        pickMC.click();
        Select smc = new Select(pickMC);
        smc.selectByVisibleText("Master card");
        driver.findElement(By.id("CardholderName")).sendKeys("Tom Smith");
        driver.findElement(By.id("CardNumber")).sendKeys("1111 2222 3333 4444");
        WebElement expmonth = driver.findElement(By.id("ExpireMonth"));
        Select smonth = new Select(expmonth);
        smonth.selectByVisibleText("12");
        WebElement expyear = driver.findElement(By.id("ExpireYear"));
        Select syear =new Select(expyear);
        syear.selectByVisibleText("2027");
        driver.findElement(By.id("CardCode")).sendKeys("111");
        clickOnElement(By.xpath("//div[@id='payment-info-buttons-container']/button"));

    }
    public void confirmorder(){
        clickOnElement(By.xpath("//div[@id='confirm-order-buttons-container']/button"));
    }
    public void ordercompleted(){
        clickOnElement(By.xpath("//div[@class='section order-completed']/div[3]/button"));

    }


}
