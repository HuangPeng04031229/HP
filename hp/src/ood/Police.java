package ood;

public class Police extends Human {
	private String id;
	private String name;
	private String age;
	private String work;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Police(String id, String name, String age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}

	public Police(String id2, String name2, int i, String work2) {
		// TODO Auto-generated constructor stub
	}

	public Police() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Police other = (Police) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Police [id=" + id + ", name=" + name + ", age=" + age + ", work=" + work + "]";
	}

	public static void main1(String[] args) {
		Worker worker = new Worker("ID-123456", "zhangsan", 36, "Worker");
		System.out.println(worker);


	Police police1 = new Police("ID-123456", "zhangsan", 36, "Worker");
	Police police2 = new Police("ID-123456", "zhangsan", 36, "Worker");
	Police police3 = new Police("ID-123455", "zhangsan", 36, "Worker");
	Police police4;

	if(police1==police2)
	{
		System.out.println("police1 == police2 :" + (police1 == police2));

	}else
	{
		System.out.println("police1 != police2 :" + (police1 != police2));
		System.out.println("police1 : " + police1);
		System.out.println("police2 : " + police2);
	}

	if(police1.equals(police2))
	{
		System.out.println("police1.equals(police2) :" + (police1.equals(police2)));
	}else
	{
		System.out.println(" !police1.equals(police2) :" + (!police1.equals(police2)));
	}

	if(police1.equals(police3))
	{
		System.out.println("police1.equals(police3) :" + (police1.equals(police3)));
	}else
	{
		System.out.println(" !police1.equals(police3) :" + (!police1.equals(police3)));
	}

	police4=police3;System.out.println("police3 : "+police3);System.out.println("police4 : "+police4);police4.setId("ID--36987");System.out.println("修改了 police4 的ID属性: ");System.out.println("police3 : "+police3);System.out.println("police4 : "+police4);

}

}
