package com.han.car;

/**
 * 继承案例子类
 * 
 * @author Administrator
 *
 */
public class Saloon_car extends Car {
	String airbag = "安全气囊";

	@Override
	public void run() {
		super.run();
		System.out.println(airbag);
	}

}
