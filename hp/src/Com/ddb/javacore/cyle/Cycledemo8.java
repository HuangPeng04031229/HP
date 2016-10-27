package Com.ddb.javacore.cyle;

public class Cycledemo8 {

	public  void main(String[] args) {
		System.out.println("三角形行数：" + args[0]);
		int n = Integer.parseInt(args[0]);
		System.out.print("");
		for (int i = 1; i <=n; i++) {
			
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				}
				else {
				if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} 
				else {
				        System.out.print(" ");
					}
				}
			}
			System.out.println();
		
		}
	}
}


