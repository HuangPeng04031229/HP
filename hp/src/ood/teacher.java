package ood;

public class teacher {
	static String name;
	static Integer age;
	static Boolean isMan;
	static Byte sex;//0--男 1---女 2---太监 3--人妖；
	public static String teacher;
	public void Teacher(){  
		//super(;
		System.out.println("我是Teacher类，无参数的构造方法，我的作用是创建物种的一个实例");
		}
	public void Teacher1(String name,Integer age){
	System.out.println("我是Teacher类，两个参数的构造方法，我的作用是创建物种的一个实例");
	// return;
	// super();
	this.name=name;
	this.age=age;
	}
	public void Teacher(String name,Integer age,Boolean isMan,Byte sex){	
	//super;
		this.age=age;
		this.name=name;
		this.isMan=isMan;
		this.sex=sex;
		System.out.println("我是Teacher类， 4个参数的构造方法，我的作用是创建物种的一个实例！");
	}
	void teacher(String course) {
	System.out.println("老师 " + name + " 教授的课程是：" + course);
	}
	public String toString() {
		return "teacher [name=" + name + ", age=" + age + ", isMan=" + isMan + ", sex=" + sex + "]";
	}
	
}
