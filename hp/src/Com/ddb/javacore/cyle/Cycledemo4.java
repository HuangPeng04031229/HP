package Com.ddb.javacore.cyle;


public class Cycledemo4 {

	public static void main(String[] args) {
      for (int i = 1; i <=5; i++) {
    	  for (int j = 0; j <=5-i; j++) 
    		  for (int m = 1; m <=i*2-1; m++) 
    			  System.out.print("*");
    				
			System.out.println(" ");
		}
}
	}

