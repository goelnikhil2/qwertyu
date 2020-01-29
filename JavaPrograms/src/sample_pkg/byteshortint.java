package sample_pkg;

public class byteshortint {
		public static void main(String[] args) {
			System.out.println("hello java byteshortint!!");
			
			int a = -412343412;
			int b = 2345611;
			int x = (a/2);
			int x1 = (b/2);
			int x2 = (57/2);
			System.out.println("int x = " +x);
			System.out.println("int x1 = " +x1);
			System.out.println("int x2 = " +x2);
			
			byte myminvalue1 = -128;
			byte myvalue1 = (byte) (myminvalue1/2);
			System.out.println("myvalue1 = " +myvalue1);
			
			short myminvalue = 128;
			short myvalue = (short) (myminvalue/2);
			System.out.println("myvalue = " +myvalue);		
			
			long myminvalue2 = 12345678901234567L;
			long myvalue2 = (long) (myminvalue2/2);
			System.out.println("myvalue2 = " +myvalue2);
		
			int m = 10;
			byte n = 20;
			short o = 30;
			long p = 50000L + 10L * (m + n + o);
			short q = (short) (10 +20 *(m +n +o));
			System.out.println("p = " +p);
			System.out.println("q = " +q);
			
		}
}