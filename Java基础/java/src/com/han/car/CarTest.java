package com.han.car;

/**
 * �̳в�����
 * 
 * @author Administrator
 *
 */
public class CarTest {
	public static void main(String[] args) {
		// ������Եı�����
		Car car = new Car();
		car.engine = "����QQ";
		car.Whell = "��»��";
		car.run();

		// ������Եı�����
		Saloon_car saloon_car = new Saloon_car();
		saloon_car.engine = "530D";
		saloon_car.Whell = "������";
		saloon_car.airbag = "��ȫ����";
		saloon_car.run();

		// ������Եı�����
		Truck truck = new Truck();
		truck.engine = "GM";
		truck.Whell = "������";
		truck.acarport = "����";
		truck.run();
	}
}
