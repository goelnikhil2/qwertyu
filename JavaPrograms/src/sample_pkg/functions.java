package sample_pkg;

public class functions {

	public static void main(String[] args) {
		System.out.println("function!!");
		
		boolean a = true;
		int b = 2;
		int c = 6;
		int d = 4;
		int f = function(a,b,c,d);
		System.out.println("function return value  =  " +f);
		b = 5;
		c = 7;
		d = 9;
		f = function(a,b,c,d);
		System.out.println("function return value  =  " +f);
		
		int nun1 = my_function(1500);
		myname("nikhil 1 ", nun1);
		nun1 = my_function(900);
		myname("nikhil 2 ", nun1);
		nun1 = my_function(400);
		myname("nikhil 3 ", nun1);
		nun1 = my_function(50);
		myname("nikhil 4 ", nun1);
		nun1 = my_function(40);
		myname("nikhil 5 ", nun1);
		nun1 = my_function(1000);
		myname("nikhil 6 ", nun1);
		nun1 = my_function(500);
		myname("nikhil 7 ", nun1);
		nun1 = my_function(100);
		myname("nikhil 8 ", nun1);
		nun1 = my_function(10);
		myname("nikhil 9 ", nun1);
	}
	
	public static void myname(String name, int nun) {
	//	System.out.println("name!!");
		System.out.println(name + " name of my frnd "
				+ nun + " is my best frnd");
	}
	
	public static int my_function(int g) {
	//	System.out.println("my_function()");
	/*	if(g>=1000) {
			return 1;
		}else if(g >= 500 && g < 1000) {
			return 2;
		}else if(g >= 100 && g < 500) {
			return 3;
		}else if(g >= 10 && g < 100) {
			return 4;
		}else {
			return 5;
		}*/
		int position =5;
		if(g>=1000) {
			position = 1;
		}else if(g>=500) {
			position = 2;
		}else if(g>=100) {
			position = 3;
		}else if(g>=10) {
			position = 4;
		}
		return position;
	}
	
	public static int function(boolean a,int b,int c,int d) {
		System.out.println("function()");
		
	
		if(a) {
		
			int e = b + (c * d);
			System.out.println("if_else_ e 1  =  " +e);
			e += 45;
			System.out.println("if_else!_ e 2  =  " +e);
			
			return e;
			
		}
		return 0;
	
	}
}
