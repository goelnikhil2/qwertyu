package sample_pkg;

public class string {
	
	public static void main(String[] args) {
		System.out.println("string!!");
		
		String mystring = "I am learning java.";
		System.out.println("my string is " +mystring);
		mystring = mystring + "I learned variables till now";
		char a = '\u1F60';
		System.out.println("my string is " +mystring+ " added more info!! " +a);
		mystring = mystring + " lets the end ";
		System.out.println("my string is " + mystring +a);
		
		String laststring = "192.72";
		System.out.println("my laststring " + laststring);
		
		laststring = laststring + ".25.82";
		System.out.println("my laststring " + laststring);
		
		int value = 50;
		laststring = "192" + value;
		System.out.println("my laststring " + laststring);
		double value1 = 198.173;
		laststring = laststring + value1;
		System.out.println("my laststring " + laststring);
		
		
		
	}
}
