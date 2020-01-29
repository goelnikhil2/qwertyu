package sample_pkg;

public class calculateinterest {
	public static void main(String[] arg) {
		System.out.println("Amount 100000 @ Interest 2% = " + calculateinterest(100000.0, 2.0));
		System.out.println("Amount 100000 @ Interest 2.5% = " + calculateinterest(100000.0, 2.5));
		System.out.println("Amount 100000 @ Interest 2.75% = " + calculateinterest(100000.0, 2.75));
		System.out.println("Amount 100000 @ Interest 3.0% = " + calculateinterest(100000.0, 3));
		System.out.println("Amount 100000 @ Interest 3.7% = " + String.format ("%.2f" , calculateinterest(100000.0, 3.7)));
		System.out.println("Amount 100000 @ Interest 4.5% = " + String.format ("%.2f" , calculateinterest(100000.0, 4.5)));

		System.out.println("____________________________________________________***********************************_________________________________________________________________");
		
		int i;
		for(i=2;i<=9;i++) {
			System.out.println("Amount 100000 @ Interest "+ i + "% = " + String.format ("%.2f" ,calculateinterest(100000.0, i)));
		}
		
		System.out.println("____________________________________________________***********************************_________________________________________________________________");
		for(i=9;i>=2;i--) {
			System.out.println("Amount 100000 @ Interest "+ i + "% = " + String.format ("%.2f" ,calculateinterest(100000.0, i)));
		}
		System.out.println("____________________________________________________***********************************_________________________________________________________________");
		int count = 0;
		for(int x=1;x<=50;x++) {
	//		System.out.println("is prime value " +isprime(x));
			if(isprime(x)) {
				count ++;
				System.out.println("count = " +count);
				System.out.println("prime number is = "+ x );
				if(count == 40) {
					System.out.println("Exiting in loop");
					break;
				}
			}
		}
		System.out.println("____________________________________________________***********************************_________________________________________________________________");
		
	}
	private static double calculateinterest(double amount, double interest) {
		return (amount * (interest /100));
	}
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
	//	for(int i = 2;i<=n/2;i++) {
		for(int i = 2;i<=(long)Math.sqrt(n);i++) {
			System.out.println("cycle " +i);
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
