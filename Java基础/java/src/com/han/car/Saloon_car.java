package com.han.car;

/**
 * �̳а�������
 * 
 * @author Administrator
 *
 */
public class Saloon_car extends Car {
	String airbag = "��ȫ����";

	@Override
	public void run() {
		super.run();
		System.out.println(airbag);
	}

}
