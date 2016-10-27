package ood2;


public class Outter {//创建一个名为Outter的外部类
	private Inner inner;
	String name="Outter";
	public void print(){
		System .out.println("我是---outter");
	}
	public Inner getInnerInstance(){
		if (inner==null) {
			inner=new Inner();
		}
		return inner;
	}
	public void execInnerPrint(){ 
		System.out.println("我是外部类，我将要执行内部类的方法");
		getInnerInstance().print();
		System.out.println("我是外部类，我执行的方法结束了");
	}
	
	class Inner{
		String name="Inner";
		public void readOutterName() {
			System.out.println("我是内部类，我将要执行外部类print方法");
			Outter.this.print();
			System.out.println("我是内部类，我将要执行外部类的方法");

		}
		public void print() {
			// System.out.println();
		System.out.println("我是---Inner");
		}
		public void execOutterPrint() {
			System.out.println("我是内部类，我将要执行外部类的print方法-----------");
			Outter.this.print();
			System.out.println("我是内部类，我将要执行外部类的print方法结束-----------");
		}
	}
	public static void main (String args[]) {
		Outter outter=new Outter();
		outter.print();//调用外部类的打印方法
		outter.readInnerName();
		outter.execInnerPrint();
		Outter.Inner inner2=outter.getInnerInstance();
		inner2.print();//调用内部类的方法
		inner2.readOutterName();
		inner2.execOutterPrint();
	}
	private void readInnerName() {
		String tmpName = getInnerInstance().name;
		System.out.println("我是Outter类  ，我可以访问内部类的名字：" + tmpName);
	}
	
}













