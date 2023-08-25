package Listenerp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GanricUtility.BaseClass;
//@Listeners(ListnerImplement.class)
public class Tc_01 extends BaseClass {
	@Test
public void demo() throws InterruptedException {
	Thread.sleep(2000);
System.out.println("test case");
//assertEquals(false, true);
}
}
