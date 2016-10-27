package ood4;

public class TestInterface implements IiPhone {

	@Override
	public void startOS() {
		System.out.println("我实现了IiPhone接口的 startOS方法！");
	}

	@Override
	public void printSelfName() {
		System.out.println("我实现了IiPhone接口的 printSelfName :" + this.getClass());
	}

	public static void main(String[] args) {
		IiPhone iiPhone = new TestInterface();
		INoteBook iNoteBook = (INoteBook) new TestInterface();

		iiPhone.startOS();
		iiPhone.printSelfName();

		iNoteBook.usePS();

	}

	@Override
	public void usePS() {
		System.out.println("我是实现了INoteBook接口，我可以使用PS的修图软件");
	}

}
