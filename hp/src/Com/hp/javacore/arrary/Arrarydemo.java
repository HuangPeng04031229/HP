package Com.hp.javacore.arrary;

import java.io.PrintStream;

public class Arrarydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		int[] intarrary;
		char[] chararrary;
		String[] strarrary;
		//数组内存开辟
		int n=5;
		intarrary=new int[n];
		out.println("Check int arrary defalut values");
		for (int i : intarrary) {
			out.println(i);
			}
		chararrary = new char[10];
		out.println("Check char arrary defalut values");
		for (char i : chararrary) {
			out.println(i);
			out.println(i);
		strarrary=new String[5];
		out.println("Check char arrary defalut values");
		for (String string : strarrary) {
			out.println(string);
			out.println(string);
			
		}
		//初始化
		intarrary[0]=10;
		intarrary[1]=20;
		intarrary[2]=30;
		out.println("int 初始化");
		for (int i1 : intarrary) {
			out.println(i1);
		}
		chararrary[1]='a';		
		chararrary[1]='a';		
		chararrary[1]='a';		
		chararrary[1]='a';		
		chararrary[1]='a';		
		out.println("String 初始化 输出： ");
		strarrary[0] = "AA";
		strarrary[1] = "BB";
		strarrary[2] = "CC";
		strarrary[3] = "DD";
		// strArrary[5]="FF";
		for (String string : strarrary) {{
			out.println(string);
		}
		}
		}
	}
}
