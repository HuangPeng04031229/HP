package Java.DataType;

import java.io.PrintStream;

public class Boy {
	public static void main (String []args){
		PrintStream prt=System.out;
		//int
		int a=10;int b=20;int c=25;int d=25;
		prt.println("int Demo:");
		prt.println("a+b="+(a+b));
		prt.println("a-b="+(a-b));
		prt.println("b/a="+(b/a));
		prt.println("b*a="+(b*a));
		prt.println("a++ ="+(a++));
		prt.println("a-- ="+(a--));
		//char
		char x,y='n';
		x='m';
		prt.println();
		prt.println("char Demo:");
		prt.print("x+y="+(x+y)+";");
		prt.print("x+y:"+String.valueOf(x)+String.valueOf(y)+";");
		
		//float
		float q,w=(float)3.0;
		q=1;
		prt.println();
		prt.println("float Demo:");
		prt.println("q+w="+(q+w)+";");
		//boolean
		boolean o,p;
		o=true;
		p=false;
		prt.println();
		prt.println("boolean Demo:");
		prt.println("o&&p="+(o&&p)+";");
		prt.println("o||p="+(o||p)+";");
		prt.println("!o="+!o+";");
		
		//string
		String tString="Hello World";
		prt.println();
		prt.println("string Demo:");
		prt.println("I Love " + tString+";");
		String boy="handsome boy";
		prt.println("boy="+(boy)+";");
		}	
}
