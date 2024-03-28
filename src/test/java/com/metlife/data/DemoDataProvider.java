package com.metlife.data;

import com.metlife.utility.ExcelUtils;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DemoDataProvider
{
@DataProvider(name="DP")
public static Object[][] getData() throws IOException
{
ExcelUtils ex=new ExcelUtils("src/test/resources/Excel.xlsx");
int counts=ex.getRowCount(0);
Object data[][]=new Object[counts][2];
for(int i=0;i<counts;i++)
{
data[i][0]=ex.getData(0,i,0);
data[i][1]=ex.getData(0,i,1);
}
return data;
}
}
