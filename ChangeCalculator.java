package basics;

public class ChangeCalculator {

	public static void main(String[] args) {

		int change = 67;
		returnChange(change);
	}

	public static void returnChange(int change) {
	
			int quartersReturned = change / 25;
			change = change - quartersReturned * 25;
			
			int dimesReturned = change / 10;
			change = change - dimesReturned * 10;
			
			int nickelsReturned = change / 5;
			change = change - nickelsReturned * 5;
			
			int penniesReturned = change;
			
			System.out.println("Quarters: " + quartersReturned);
			System.out.println("Dimes: " + dimesReturned);
			System.out.println("Nickels: " + nickelsReturned);
			System.out.println("Pennies: " + penniesReturned);
		
	}
	
}

