package sample_pkg;

public class Arrays {
	 public static void main (String[] args)  
	    {          
	      int[] arr; 
	      arr = new int[10]; 
	      arr[0] = 10; 
	      arr[1] = 20; 
	      arr[2] = 30; 
	      arr[3] = 40; 
	      arr[4] = 50; 
	          
	      for (int i = 0; i < arr.length; i++) 
	         System.out.println("Element at index " + i + " : "+ arr[i]);           
	    
	 
		 int arr1[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
		  
	        // printing 2D array 
	        for (int i=0; i< 3 ; i++) 
	        { 
	            for (int j=0; j < 3 ; j++) 
	                System.out.print(arr1[i][j] + " "); 
	  
	            System.out.println(); 
	        } 
	        
	      
	  }
}

