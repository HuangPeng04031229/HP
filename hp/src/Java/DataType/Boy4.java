package Java.DataType;

import java.io.PrintStream;

public class Boy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream prt=System.out;
		Integer integer1=20;
		Integer integer2=12;
		prt.println("integer1 :"+integer1.toBinaryString(integer1));
		prt.println("integer2 :"+integer2.toBinaryString(integer2));
		prt.println("integer1 & integer2 :"+ (integer1&integer2));
		prt.println("integer1 & integer2 :"+integer2.toBinaryString(integer1&integer2));
		prt.println("integer1 | integer2 :"+ (integer1|integer2));
		prt.println("integer1 | integer2 :"+integer2.toBinaryString(integer1 | integer2));
		prt.println("integer1 ^ integer2 :"+ (integer1^integer2));
		prt.println("integer1 ^ integer2 :"+integer2.toBinaryString(integer1 ^ integer2));
		prt.println("~integer1 :"+(~integer1));
		prt.println("~integer1 :"+integer2.toBinaryString(~integer1));
		prt.println("integer1<<1 :"+integer2.toBinaryString(integer1<<1));
		prt.println("integer2<<1 :"+integer2.toBinaryString(integer2<<1));
		prt.println("integer2<<32 :"+integer2.toBinaryString(integer2<<32));
		
		prt.println("integer1>>1 :"+integer2.toBinaryString(integer1>>1));
		prt.println("integer2>>1 :"+integer2.toBinaryString(integer2>>1));
		prt.println("integer2>>32 :"+integer2.toBinaryString(integer2>>32));
		
		prt.println("integer1>>32 :"+integer2.toBinaryString(integer1>>32));
		prt.println("integer1>>31 :"+integer2.toBinaryString(integer1>>31));
		prt.println("integer1>>9 :"+integer2.toBinaryString(integer1>>9));
		
		prt.println("integer1>>>1 :"+integer2.toBinaryString(integer1>>>1));
		prt.println("integer1>>>2 :"+integer2.toBinaryString(integer1>>>2));
		prt.println("integer1>>>32 :"+integer2.toBinaryString(integer1>>>32));
		}
}
