package com.han.cover;

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
		car.run();

		// 定义测试的变量名
		Saloon_car saloon_car = new Saloon_car();
		saloon_car.run();

		// 定义测试的变量名
		Truck truck = new Truck();
		truck.run();
	}
}
