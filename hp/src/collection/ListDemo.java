package collection;

import java.io.PrintStream;
import java.util.ArrayList;

import ood.Human;

public class ListDemo {

	public static void main(String[] args) {
		PrintStream out=System.out;
		ArrayList<String> strList=new ArrayList<String>();
		ArrayList<Integer> intList=new ArrayList<Integer>();
		ArrayList<Human> huList=new ArrayList<Human>();
		out.println("strList元素的个数 :"+strList.size());
		strList.add("I");
		strList.add("love");
		strList.add("my");
		strList.add("wife");
		out.println("strList的内容 :"+strList.toString());
		
		out.println("strList删除内容:");
		strList.remove("I");
		out.println("strList的内容 :"+strList.toString());
		strList.remove(0);
		out.println("strList的内容 :"+strList.toString());
		strList.add(0,"I");
		strList.add(1,"love");
		out.println("strList的内容 :"+strList.toString());
		out.println("strList.isEmpty(); :"+strList.isEmpty());
		out.println("strList.size() :"+strList.size());
		out.println("strList.contains('I') :"+strList.contains("I"));
		
		
		
	}

}
