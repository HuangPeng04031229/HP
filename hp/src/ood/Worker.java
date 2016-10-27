package ood;


public class Worker extends Human {
	private String country;

	public Worker(String id,String name,Integer age,String work) {
		super();
		System.out.println("这是Worker的无参构造方法，用来创建Worker类的一个实例对象！");
	}	
	
public Worker(String id,String name,String age,String work,String country) {
	super(id, name,age, work);
	this.country=country;
	System.out.println("这是Worker的无参构造方法，用来创建Worker类的一个实例对象！");
}	
public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return  super.toString() + "----Worker [country=" + country + "]";
}

public static void main(String[] args) {
	Worker worker = new Worker("ID-123456","zhangsan",36,"Worker");
	System.out.println(worker);
	
}	

}

