package Com.ddb.javacore.cyle;

import java.io.PrintStream;

public class Cycledemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PrintStream out=System.out;
       out.println();
	   out.println("while demo :");
       int x=4;
       int y=1;
       while (y<=x) {
    	   out.println("y="+y);
    	   y++;
    	   out.println("y="+y);
    	   }
	}
	
}
