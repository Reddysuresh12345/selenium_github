package Ganrics;

import org.testng.annotations.Test;

import GanricUtility.Excelutility;

public class DemoData {
	@Test(dataProvider = "data",dataProviderClass = Excelutility.class)
	public void demo(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);
	}
}
