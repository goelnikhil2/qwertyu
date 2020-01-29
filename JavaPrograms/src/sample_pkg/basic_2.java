package sample_pkg;

public class basic_2 {
	public static void main(String[] args) {
	
		System.out.println("hello java!!");
	
		int a = 10;
		int n = 0;
		double b = 5;
		float c = 5.8f;
		char d = 5;
		double fiveForths = (a+(b+c))+((c+a) +b);
		
		System.out.println("a="+a+ 
				"b="+b+ 
				"c="+c+ 
				"fiveForths="+fiveForths);
		while(b == 9){
					b = readInt("Enter ");
			
			}
		{
		if( a == b) {
			if(b == c){
				if(b == d)
					System.out.println("b = d");
			}
			else
				System.out.println("a = c");
		}
		else
			System.out.println("a =! b");
		}
		System.out.println("b == d");
	}

	private static double readInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}