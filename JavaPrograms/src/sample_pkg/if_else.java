package sample_pkg;

public class if_else {

	public static void main(String[] args) {
		System.out.println("if_else!!");
		
		
		boolean a = true;
		int b = 2;
		int c = 6;
		int d = 4;
		
		my_function(a, b,c,d);
		b= 11;
		c= 7;
		d= 40;
		
		my_function(a, b,c,d);
		
		if(b < 10 && b > 6) {
			System.out.println("if_else____!!");
		} else if(b < 6){
			System.out.println("if_else!!___");
			
		}else {
			System.out.println("if_else!_!");
			
		}
		
	}
	public static int my_function(boolean a,int b,int c,int d) {
		System.out.println("my_function()");
		
		
		
		if(b < 10 && b > 6) {
			System.out.println("if_else____!!");
		} else if(b < 6){
			System.out.println("if_else!!___");
			
		}else {
			
			System.out.println("if_else!_!");
			
		}
		if(a) {
		
			int e = b + (c * d);
			System.out.println("if_else_ e 1  =  " +e);
			e += 45;
			System.out.println("if_else!_ e 2  =  " +e);
			
			return e;
			
		}
		
		return -1;
		
	}
}
