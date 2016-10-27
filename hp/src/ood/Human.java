package ood;


public class Human {
	private String ID;
	private String name;
	private String age;
	private String work;
	
	
	public Human() {
		super();
		System.out.println("这是Human类的无参构造方法，作用创建Human类的一个实例");
		}
	
	

	public Human(String iD, String name, String age, String work) {
		super();
		
		this.ID = iD;
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("四个参数");
	}



	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWork() {
		return age;
	}
	public void setWork(String Work) {
		this.work = Work;
	}

	@Override
	public String toString() {
		return "Human [ID=" + ID + ", name=" + name + ", age=" + age + ", work=" + work + "]";
	}

	
}
