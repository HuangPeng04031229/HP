package Com.ddb.javacore.cyle;

import java.io.PrintStream;

import Com.ddb.javacore.branch.branch;

public class CycleDemo {
	public static void main(String[] args) {
		PrintStream out =System.out;
		
		//for
		out.println();
		out.println("For demo :");
		for (int i = 0; i < 3; i++) {
			out.println("i ="+i);
		}
		out.println();
		out.println("For 循环：1+...100 = ");
		int all = 0;
		for (int i=1; i <=100; i++) {
			if (i==29) {
				out.println("去除29：");
				continue;
				}
			if (i==80) {
				out.println("截止");
				break;
				
			}
			//out.println("i ="+i);
			all =all+i;
		}
		out.println("all="+all);
		//	while
		out.println();
		out.println("while demo :");
		int x=4;
		int y=0;
		while (y<=x) {
			out.println("y="+y);
			y++;
			out.println("y="+y);
			}
		//do while
		out.println();
		out.println(" do while demo :");
		int m=3;
		do {
			out.println("m="+m);
			m--;
			out.println("m="+m);
		} while (m>=-1);
		//foreach
		out.println();
		out.println("foreach demo :");
		int[] arry={11,22,33,44,55,66};
		for (int i: arry) {
			out.println("i="+i);
			}
		
		//99乘法表
		out.println();
		out.println("99乘法表  demo :");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(i+"*"+j+"="+i*j+"\t");
			}
			out.println();
			
			}
		out.println("直角三角形");
		for (int i = 1; i <=5; i++) {
				for (int k = 1; k <=2*i-1; k++) 
				out.print("*");	
				out.println();
		}
	
		out.println("上直角三角形");
		for (int i = 1; i <=5; i++) {
				for (int j = 5; j>=i; j--)
				out.print("* ");	
				out.println();
}	
		out.println();
}
}

