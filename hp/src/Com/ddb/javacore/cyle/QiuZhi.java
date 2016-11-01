package Com.ddb.javacore.cyle;

import java.util.Scanner;

public class QiuZhi {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double a,b,c;
		double x1,x2;
		System.out.print("请输入a：");
a = in.nextInt();
		System.out.print("请输入b：");
b = in.nextInt();
		System.out.print("请输入c：");
c = in.nextInt();

		x1 = ((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 = ((-b)-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.print("x1="+x1+"\tx2="+x2);
	}
	
}
