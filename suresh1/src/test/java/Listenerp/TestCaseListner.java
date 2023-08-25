package Listenerp;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo.class)

public class TestCaseListner {
		@Test
	
		public void demoForListner() {
			System.out.println("done from testcase");
			
		}
		@Test
		
		public void demoListenerMethods() {
			System.out.println("done from demoforlistnermethods");
			
			assertFalse(true);
		}
	}


