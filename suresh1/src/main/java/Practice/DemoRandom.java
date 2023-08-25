package Practice;

import GanricUtility.Javautility;

public class DemoRandom {
public static void main(String[] args) {
	Javautility javau=new Javautility();
	for(int i=1000;i<1200;i++) {
		System.out.println(javau.genaratingRandomNumbers(i));
	}
}
}
