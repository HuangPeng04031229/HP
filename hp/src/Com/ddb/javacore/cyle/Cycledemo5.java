package Com.ddb.javacore.cyle;

public class Cycledemo5 {

	public static void main(String[] args) {
		System.out.println("三角形行数："+args[0]);
		int n=Integer.parseInt(args[0]);
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) 
				System.out.print(" ");
				for (int k = 1; k<=i*2-1; k++) 
				 System.out.print("*");
				System.out.print("\n");
		}
	}
			
		}
	
