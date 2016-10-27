package ood3;

public class Student extends Person {

	private static final String age = null;
	private static final String occupation = null;
	private String name;

	public Student(String name, int string, String occupation) {
		super(name, string, occupation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String talk() {
		return "学生————>姓名："+this.name+",年龄"+this.age+"职业"+this.occupation+"!";
	}

}
