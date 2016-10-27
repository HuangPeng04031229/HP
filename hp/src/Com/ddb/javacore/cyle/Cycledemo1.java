package Com.ddb.javacore.cyle;

import java.io.PrintStream;

public class Cycledemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		int a,b,c;
		a=3;b=5;c=2;
		double x1,x2;
		double dat=b*b-4*a*c;
		if (dat<0) {
			out.println("没有实数根");
		}
		if(dat==0){
			dat=Math.sqrt(b*b-4*a*c);
			
			
			
		}
		
		
	}
}
