package com.han.car;

/**
 * 继承案例子类
 * 
 * @author Administrator
 *
 */
public class Truck extends Car {
	String acarport="货舱";
	@Override
	public void run() {
		super.run();
		System.out.println(acarport);
	}
}