package commonAPI;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Rashed on 12/30/2015.
 */
public class Base {
    public WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }


    //helper methods
    public void clickOnCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //helper methods
    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.CLEAR);
    }


    //helper methods to send ENTER key
    public void keysInput(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCssThenEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.CLEAR, value, Keys.ENTER);
    }

    public void typeByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickByName(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();

        return st;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();

        return st;
    }

    public String getTextById(String locator) {
        return driver.findElement(By.id(locator)).getText();

    }

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();

        return st;
    }

    public WebElement getWebElementByCss(String locator) {
        return driver.findElement(By.cssSelector(locator));

    }

    public List<WebElement> getWebElementsByCss(String locator) {
        List<WebElement> elementList = new ArrayList<WebElement>();
        elementList = driver.findElements(By.cssSelector(locator));

        return elementList;
    }

    public WebElement getWebElementByXpath(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));

        return element;
    }

    //constant sleep time
    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(1000 * sec);

    }

}