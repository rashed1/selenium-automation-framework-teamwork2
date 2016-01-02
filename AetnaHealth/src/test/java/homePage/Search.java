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
    }


}
