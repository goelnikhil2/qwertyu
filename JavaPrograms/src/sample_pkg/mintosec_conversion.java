package sample_pkg;

public class mintosec_conversion {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	public static void main(String[] args) {
		System.out.println(timeconversion(100 , 55));
		System.out.println(timeconversion(7678L));
		System.out.println(timeconversion(46 , 20));
		System.out.println(timeconversion(76666));
		System.out.println(timeconversion(767, 59));
		System.out.println(timeconversion(610));
		
		
	}
	private static String timeconversion(long min , long second) {
		
		if ((min < 0) || (second < 0) || (second >59)) {
			return INVALID_VALUE_MESSAGE;
		}
		long hour = min / 60;
		long remainingmin = min % 60;
		String hourstring = hour +" H : ";
		if (hour < 10) {
			hourstring = "0" + hourstring;
		}
		String minstring = remainingmin +" M : ";
		if (remainingmin < 10) {
			minstring = "0" + minstring;
		}
		String secondstring = second +" S";
		if (second < 10) {
			secondstring = "0" + secondstring;
		}
		return hourstring + "" + minstring + "" +secondstring+ "";
		
	}
	private static String timeconversion(long second) {
		if (second < 0) {
			return INVALID_VALUE_MESSAGE;			
		}
		long min = second/60;
		long remainingsec = second % 60;
		return timeconversion(min , remainingsec);
	}	
	
}
