package homePage;

import commonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Rashed on 1/2/2016.
 */
public class Search extends Base {
    //@Test
    public void test1(){
        clickOnCss("#globalSearch");
        typeByCss("#globalSearch", "insurance");
        keysInput("#globalSearch");
        System.out.println(driver.getCurrentUrl());
    }


    @Test
    public void test2() throws InterruptedException{
        clickByXpath("html/body/div[2]/div[2]/header/div/div/div/nav/ul/li[4]/a");
        System.out.println(driver.getCurrentUrl());
        clickByXpath(".//*[@id='main']/div/div[1]/div/div/div[2]/div/div");


        driver.navigate().to("http://www.aetna.com/dse/search?site_id=dse");
        typeByCss("#hl-autocomplete-search", "primary care physician");
        typeByCss("#hl-autocomplete-search-location", "33620");
        keysInput("#hl-searchbar-button");
        clickOnCss("#contWOPlan_ft");
        sleepFor(5);
        System.out.println(driver.getCurrentUrl());


    }



}
