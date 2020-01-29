package sample_pkg;

public class calculate_interest {
	public static void maim(String[] arg) {
		System.out.println("Amount 100000 @ Interest 2% = ");
		double system = calculateinterest(100000.0, 2.0);
		System.out.println("Amount 100000 @ Interest 2% = " + system);
	}
	private static double calculateinterest(double amount, double interest) {
		return (amount * (interest /100));
	}
}
