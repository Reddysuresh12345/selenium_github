package GanricUtility;

import java.util.Random;

public class Javautility {
public int genaratingRandomNumbers(int range)
/**
 * this method is used to generate random numbers
 * @param range
 * @return
 */
{
	
	Random random=new Random();
	return random.nextInt(range);
}
}
