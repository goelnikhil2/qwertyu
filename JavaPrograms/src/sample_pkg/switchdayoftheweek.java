package sample_pkg;

public class switchdayoftheweek {
	public static void main(String[] arg) {
		daysoftheweek(-1);
		daysoftheweek(0);
		daysoftheweek(1);
		daysoftheweek(2);
		daysoftheweek(3);
		daysoftheweek(4);
		daysoftheweek(5);
		daysoftheweek(6);
		daysoftheweek(123);
	}
	private static void daysoftheweek(int day) {
/*		System.out.println("Entered value for Switch");
		switch(day) {
		case 0: 
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Day");
			break;
		}
*///		System.out.println("Entered values for ifelse statement");
		if (day == 0) {
			System.out.println("Sunday");
		}else if (day == 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Tuesday");
		}else if (day == 3) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Invalid Day");
		}
	}
}
