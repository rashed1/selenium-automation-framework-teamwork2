package commonAPI;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;


/**
 * Created by Rashed on 12/30/2015.
 */
public class Base {
    private WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }



}

