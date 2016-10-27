package ood3;

import lombok.Getter;
import lombok.Setter;

public abstract class Phone {
	@Setter@Getter
	private String model;
	//private String vender;
	@Getter@Setter
	private static String os = "Android";
	public abstract void startOs();
	public Phone() {
		super();
		System.out.println("我是无参父类，我在执行无参构造方法");
	}
	public void printSelf() {
		System.out.println("我的型号是 ： " + model);
	}
}
