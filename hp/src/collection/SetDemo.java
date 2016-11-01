package collection;

import java.awt.List;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.event.InternalFrameListener;

import ood.Human;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> intset=new HashSet<Integer>();
		Set<String> strset=new HashSet<String>();
		Set<Human> huset=new HashSet<Human>();
		ArrayList<Integer> intList=new ArrayList<Integer>();
		PrintStream out=System.out;
		out.println("intset添加元素之前 ：" +intset);
		intset.add(10);
		intset.add(11);
		intset.add(12);
		intset.add(13);
		intset.add(14);
		out.println("intset添加元素之后 ：" +intset);
		out.println("intset。size添加元素之后 ：" +intset.size());
		
		intset.remove(15);
		out.println("intset删除之后 ：" +intset);
		intset.remove(14);
		out.println("intset删除之后 ：" +intset);
		intset.add(14);
		out.println("intset删除之后 ：" +intset);

		out.println("intset.toArray() ：" +intset.toArray());
		out.println("intset :"+ intset);
		Object[] objects=intset.toArray();
		for (Object object : objects) {
			out.println(object);
		}
		for (int i = 1; i <=15; i++) {
			intList.add(i+10);
		}
		intList.add(11);
		intList.add(11);
		intList.add(11);
		intList.add(11);
		intList.add(11);
		out.println("intList :"+ intList);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		intList.remove(11);
		
		out.println("intList :"+ intList);
		ArrayList<Integer> intList2=new ArrayList<Integer>();
		intList2.add(11);
		intList.removeAll(intset);
		out.println("intList :" +intList);
	}

}
