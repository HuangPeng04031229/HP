package ood3;

public abstract class Person {
	private String name;
	private int age;
	private String occupation;
	public Person(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public Person(String name2, String string, String occupation2) {
		// TODO Auto-generated constructor stub
	}
	public abstract String talk();
	
}
