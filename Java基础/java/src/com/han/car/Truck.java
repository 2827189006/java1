package com.han.car;

/**
 * �̳а�������
 * 
 * @author Administrator
 *
 */
public class Truck extends Car {
	String acarport="����";
	@Override
	public void run() {
		super.run();
		System.out.println(acarport);
	}
}