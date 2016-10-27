package Com.ddb.javacore.branch;

import java.io.PrintStream;


public class branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream prt=System.out;
		//if demo
		int x=Integer.parseInt(args[0]+"");
		prt.println();
		prt.println("if demo");
		if (x==3) {
			prt.println("if demo :"+x);
		}
		//if else
		prt.println();
		prt.println("if else demo");
		if (x>=5) {
			prt.println("if else demo:x=="+x);
			
		} else {
			prt.println("if else demo:x!="+x);

		}
		//if else if else
		prt.println();
		prt.println("if else if else demo");
		if (x>3) {
			prt.println("if case x>3:");
			}
		else if (x==3) {
			prt.println("if case x==3:");
			}
		else if (x<3) {
			prt.println("if case x<3:");
		}
		//switch
		prt.println();
		prt.println("switch demo");
		switch (x) {
		case 1:
			prt.println("X=1;");

			break;
		case 2:
			prt.println("X=2;");

		default:
			prt.println("X;"+x);
			break;

		}
		//? x:y
		prt.println();
		prt.println("switch demo");
		int k=(x>3)?6:7;
		prt.println("k="+k);


	}
}
