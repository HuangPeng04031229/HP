package Com.ddb.javacore.cyle;

import java.io.PrintStream;

public class Cycledemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		//99乘法表
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				out.print(i+"*"+j+"="+i*j+"\t");;
				
			}
			out.println();
			}
	}

}
