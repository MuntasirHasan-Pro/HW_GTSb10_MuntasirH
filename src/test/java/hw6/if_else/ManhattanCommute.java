package hw6.if_else;

public class ManhattanCommute {

	/* 
	1. Dipjol wants to go to Manhattan, he has various ways to commute. 
	But not all the time every vehicle is available. 
	Make a program that helps Dipjol decide whether to go to Manhattan or not. 
	Vehicles available: Car, Uber, Subway, Bus, or just stay home.
	 */
	
	public static void main(String[] args) {
		String vehicle = "cycle";
		
		if (vehicle == "Car") {
			System.out.println("Go to Manhattan with your car, you will arrive in 12 minutes");
		} else if (vehicle == "Uber") {
			System.out.println("Go to Manhattan but 1st call an uber, you will arrive in 20 minutes");
		} else if (vehicle == "Subway") {
			System.out.println("Go to Manhattan, you will arrive in 30 minutes");
		} else if (vehicle == "Bus") {
			System.out.println("Go to Manhattan, you will arrive in 40 minutes");
		} else {
			System.out.println("Just stay home bruh!");
		}
	}
	
}