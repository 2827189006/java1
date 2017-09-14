package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author 嵌套if语句
 *
 */
public class PayDemo1 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 3;
		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c && a + c > b && b + c > a) {
				System.out.println("这个数字能够组成三角形！");
			} else {
				System.out.println("这个数字不能够组成三角形！");
			}
		} else {
			System.out.println("三角形的三条边必须是整数！");
		}
	}
}