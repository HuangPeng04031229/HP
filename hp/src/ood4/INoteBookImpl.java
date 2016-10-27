package ood4;

public class INoteBookImpl implements INoteBook {

	@Override
	public void usePS() {
		System.out.println("我是拎一个INotebook类，我也可以使用PS");
	}

	@Override
	public void printSelfName() {
		System.out.println("我是另一个INoteBook借口的实现类，我的实现类的名字："+this .getClass());
	}

	@Override
	public void startOS() {
		System.out.println("我是另一个INoteBook接口的实现类，我正在启动系统");
	}
	public static void main(String args[]){
		INoteBook impl=new INoteBookImpl();
		impl.startOS();
		impl.printSelfName();
		impl.usePS();
		
		System.out.println("****************");
		TestInterface impl2=new TestInterface();
		impl2.startOS();
		impl2.printSelfName();
		impl2.usePS();
	}
}
