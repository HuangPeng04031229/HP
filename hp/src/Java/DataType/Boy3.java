package Java.DataType;

import java.io.PrintStream;

public class Boy3 {

	public static void main(String[] args) {
		PrintStream prt=System.out;
		
		Byte byte1=16;
		Byte byte2=18;
		
		Integer integer1=25;
		Integer integer2=26;
		
		Short short1=256;
		Short short2=258;
		
		Long long1=525L;
		Long long2=527L;
		
		Float float1=3.5F;
		Float float2=3.6F;
		prt.println("byte1+byte2 =" + (byte1+byte2));
		prt.println("integer1+integer2=" + (integer1+integer2));
		prt.println(integer1+integer2);
		prt.println(integer1+byte1);
		prt.println(float1+float2);
		prt.println(long1+long2);
		prt.println(short1+short2);
		prt.println(long1+short1);
		String s1=""+byte2;
		integer2=Integer.parseInt(""+byte2);
		prt.println("integer2 :"+ integer2);
		String s=Byte.toString(byte2);
		integer2=Integer.parseInt(Byte.toString(byte2));
		prt.println("integer2 :"+ integer2);
		integer2=byte2.intValue();
		prt.println("integer2 :"+ integer2);

	}

}
