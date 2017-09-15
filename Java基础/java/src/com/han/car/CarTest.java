package com.han.car;

/**
 * 继承测试类
 * 
 * @author Administrator
 *
 */
public class CarTest {
	public static void main(String[] args) {
		// 定义测试的变量名
		Car car = new Car();
		car.engine = "奇瑞QQ";
		car.Whell = "邓禄普";
		car.run();

		// 定义测试的变量名
		Saloon_car saloon_car = new Saloon_car();
		saloon_car.engine = "530D";
		saloon_car.Whell = "米其林";
		saloon_car.airbag = "安全气囊";
		saloon_car.run();

		// 定义测试的变量名
		Truck truck = new Truck();
		truck.engine = "GM";
		truck.Whell = "固特异";
		truck.acarport = "货舱";
		truck.run();
	}
}
