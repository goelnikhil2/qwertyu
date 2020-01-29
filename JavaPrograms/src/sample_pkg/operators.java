package sample_pkg;

public class operators {
	public static void main(String[] args) {
		System.out.println("operators !!");
		
		int result = 2 + 3;
		System.out.println("result 2 + 3 = " +result);
		
		int previousresult = result;
		System.out.println("previousresult = " +previousresult);
		
		result = result - 2;
		System.out.println(previousresult + " - 2 =  result for subtraction =" +result);
		
		previousresult = result;
		 
		result = result * 5;
		System.out.println(previousresult + " * 5 =  result for multiplcation = " +result);
		
		previousresult = result;
		
		result = result / 3;
		System.out.println(previousresult + " / 3 =  result for division = " +result);
		
		previousresult = result;
		
		result = result % 2;
		System.out.println(previousresult + " % 2 =  result for modulus(reminder) = " +result);
		
		
		previousresult = result;
		
		result = result - 2 + 4;
		System.out.println(previousresult + " - 2 + 4 = result for all = " +result);
		
		previousresult = result;
		
		boolean value = true;
		if(value == true)
			System.out.println("Its a right operator !!");
		
		if(value == false)
			System.out.println("Its a wrong operator !!");
		
		int top = 100;
		int low = 80;
		
		if (top < 100)
			System.out.println("Its a right choice baby !!");
		if(top > low && top <100)
			System.out.println("Its a right choice !!");
		
		if (top == low)
			System.out.println(" values are equal!!");
		else
			System.out.println("valus are not equal !!");
		
		if (top != low)
			System.out.println(" values are not equal!!");
		else
			System.out.println("valus are equal !!");
		
		if (top > low)
			System.out.println(" values are greater than other!!");
		else
			System.out.println("valus are smaller than other !!");
		
		if (top < low)
			System.out.println(" values are greater than other!!");
		else
			System.out.println("valus are smaller than other !!");
		
		if (top >= low)
			System.out.println(" values are greater than equal!!");
		else
			System.out.println("valus are smaller than equal !!");
		
		if (top <= low)
			System.out.println(" values are greater than equal!!");
		else
			System.out.println("valus are smaller than equal !!");
		
		
		if(previousresult>2)
				System.out.println("Its a right choice baby !!");
				System.out.println("Its a  operator !!" +previousresult);
			
			
				String test = "asdf";
		    	boolean result1;
		    	
		    	result1 = test instanceof String;
		    	System.out.println(result1);
			
		    	double number = 5.2, resultNumber;
		    	boolean flag = false;
		    	
		    	System.out.println("+number = " + +number);
		    	// number is equal to 5.2 here.
		    	
		    	System.out.println("-number = " + -number);
		    	// number is equal to 5.2 here.
		    	
		        // ++number is equivalent to number = number + 1
		    	System.out.println("number = " + ++number);
		        // number is equal to 6.2 here.

		        // -- number is equivalent to number = number - 1
		    	System.out.println("number = " + --number);
		        // number is equal to 5.2 here.

		    	System.out.println("!flag = " + !flag);
		    	// flag is still false.
		    	
		    	double number2 = 7.2;

		    	System.out.println(number2++);
		    	System.out.println(number2);
		    	System.out.println(++number2);
		    	System.out.println(number2);
		    	System.out.println(number2--);
		    	System.out.println(number2);
		    	System.out.println(--number2);
		    	System.out.println(number2);
			
		
		    	int number5 = 1, number6 = 2, number7 = 9;
		    	boolean result4;
		    	
		    	// At least one expression needs to be true for result to be true
		    	result4 = (number5 > number6) || (number7 > number5);
		    	// result will be true because (number1 > number2) is true
		    	System.out.println(result4);
		    			
		    	// All expression must be true from result to be true	
		    	result4 = (number5 > number6) && (number7 > number5);
		    	// result will be false because	(number3 > number1) is false
		    	System.out.println(result4);
		
		
		    	int februaryDays = 29;
		    	String result5;
		    	
		    	result5 =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
		    	System.out.println(result5);
		
		
		
		
	
	}
}
