package homePage;

import commonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Rashed on 1/2/2016.
 */
public class Search extends Base {
    @Test
    public void test1(){
        clickOnCss("#globalSearch");
        typeByCss("#globalSearch", "insurance");
        keysInput("#globalSearch");
        System.out.println(driver.getCurrentUrl());
    }


    @Test
    public void test2(){
        clickByXpath("html/body/div[2]/div[2]/header/div/div/div/nav/ul/li[4]/a");
        System.out.println(driver.getCurrentUrl());

    }



}
