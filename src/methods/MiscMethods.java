package methods;

import java.util.Random;

public class MiscMethods {
	
	Random random = new Random();
	
	public String coinFlip() {
		
		String [] arr = {"Heads", "Tails"};
		int select = random.nextInt(arr.length);
		return arr[select];
	}
	
	public int diceRoll() {
		
		int roll = random.nextInt(20) + 1;
		return roll;
	}
}
