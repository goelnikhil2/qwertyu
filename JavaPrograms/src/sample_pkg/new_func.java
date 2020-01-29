package sample_pkg;

public class new_func {
	public static void main(String[] args) {
		System.out.println("new_func!!");
		
		int score = calculate("Nikhil",900);
		System.out.println("New Score is " +score);
		calculate(590);
		System.out.println("New 2nd Score is " +score);
		calculate();
		double CM = calculatefeetandinchtocm(1 ,0);	
		if (CM < 0.0) {
			System.out.println("CM entered values are not valid");
			}
		calculatefeetandinchtocm(100);
		}
	public static int calculate(String pname, int sc) {
		System.out.println("Name of player " +pname+ " occured " +sc+" points.");
		return sc * 100;
			
	}	
	public static int calculate(int sc) {
		System.out.println("Player occured " +sc+" points.");
		return sc * 100;
	}
	public static int calculate() {
		System.out.println("Player occured No points.");
		return 0;
	}
	public static double calculatefeetandinchtocm(double feet, double inch) {
	//	if((feet < 0) || (inch < 0) && (inch > 12)) {
		if((feet < 0) || (inch < 0) || (inch > 12)) {
				
			System.out.println("Feet and Inch values are not valid");
			return -1;			
		}
		double CM = (feet*12)*2.54;
		System.out.println("CM " +CM);
		CM += inch*2.54;
		System.out.println("FEET = " +feet+" inch = " +inch+ " centimeter = " +CM);
		return CM;
		
	}
	public static double calculatefeetandinchtocm(double inch) {
		
			if(inch < 0){
				return -1;
			}
				double feet = (int)inch / 12;
				double newinch = (int)inch % 12;
				double CM = (feet*12)*2.54;
				System.out.println("CM " +CM);
				CM += newinch*2.54;
				System.out.println(inch+ " Inch are equal to New Feet = " +feet+ " & New Inch = " +newinch);
				System.out.println("FEET = " +feet+" inch = " +newinch+ " centimeter = " +CM);
				return calculatefeetandinchtocm(feet, newinch);			
	}
}
