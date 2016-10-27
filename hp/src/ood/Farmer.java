package ood;

public class Farmer {
	private String id;
	private String name;
	private Integer age;
	static String WORK="working";
	

	public static String getWORK() {
		return WORK;
	}


	public static void setWORK(String wORK) {
		WORK = wORK;
	}

	public static void work() {
		System.out.println("I'm working,I'm Farmer!");	
		}
	public static void main(String[] args) {
		System.out.println(Farmer.WORK);
		Farmer.work();
		Farmer farmer=new Farmer();
		Farmer.setWORK("**********");
		System.out.println(Farmer.WORK);
		
	}

}
