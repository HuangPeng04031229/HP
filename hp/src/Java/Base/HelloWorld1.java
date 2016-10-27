package Java.Base;
import java.io.PrintStream;
public class HelloWorld1 {
	public static void main (String []args){
		   PrintStream out= System.out;
		   out.println("Hello World!");
		   out.println("我的名字叫什么˭"+args[0]+"我的年龄是多少"+args[1]);
		   out.println(args[2]);
		}
}
