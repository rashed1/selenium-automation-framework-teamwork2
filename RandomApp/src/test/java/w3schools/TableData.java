package w3schools;

import commonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Rashed on 1/2/2016.
 */
public class TableData extends Base
{
    @Test
    public void getTableData(){
        String text = getTextByCss(".table-responsive tbody");
        System.out.println(text);
    }



}
