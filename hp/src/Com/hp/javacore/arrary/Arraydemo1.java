package Com.hp.javacore.arrary;

import java.io.PrintStream;
import java.util.Arrays;


public class Arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		int []intarray={00,11,44,22,77,66};
		int []intarrary=new int[3];
		System.arraycopy(intarray, 2, intarrary, 0, 2);
		for (int i : intarrary) {
			out.println(i);
			}
		out.println("***************");
		out.println("arrays sort demo :");
		Arrays.sort(intarray);
		for (int i : intarray) {
			out.println(i);
			}
		out.println("***************");

		}
		}
	
		
		
		
	
