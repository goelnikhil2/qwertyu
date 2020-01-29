package sample_pkg;

public class Switch {
	public static void main(String[] args) {
		int value = 4;
		
		switch(value) {
		case 1: 
			System.out.println("hello java!! value = 1");
			break;
		case 2: 
			System.out.println("hello java!! value = 2");
			break;
		case 3: case 4 : case 5:
			System.out.println("hello java!! value is either for 3 or 4 or 5");
			System.out.println("value = "+value);
			break;
		default: 
			System.out.println("hello java!! default switch");
			break;
		
		}
		char charvalue = 'A';
		switch(charvalue) {
		case 'A': 
			System.out.println("hello java!! value = A");
			break;
		case 'B': 
			System.out.println("hello java!! value = B");
			break;
		case 'C': case 'D' : case 'E':
			System.out.println("hello java!! value is either for C or D or E");
			System.out.println("value = "+charvalue);
			break;
		default: 
			System.out.println("hello java!! default switch");
			break;
			
		}
		String month = "Feb";
		switch(month.toLowerCase()) {
 		case "jan": 
			System.out.println("hello java!! value = jan");
			break;
		case "feb": 
			System.out.println("hello java!! value = feb");
			break;
		case "mar": case "apr" : case "may":
			System.out.println("hello java!! value is either for C or D or E");
			System.out.println("value = "+month);
			break;
		default: 
			System.out.println("hello java!! default switch");
			break;
			
		}
	}

}
