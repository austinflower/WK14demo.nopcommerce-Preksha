package demo.nopcommerce.com.testbase;

import demo.nopcommerce.com.propertyreader.PropertyReader;
import demo.nopcommerce.com.utility.Utility;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

   /* @AfterMethod
    public void tearDown(){
      closeBrowser();
    }*/


}
