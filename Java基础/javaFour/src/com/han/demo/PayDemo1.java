package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author Ƕ��if���
 *
 */
public class PayDemo1 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 3;
		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c && a + c > b && b + c > a) {
				System.out.println("��������ܹ���������Σ�");
			} else {
				System.out.println("������ֲ��ܹ���������Σ�");
			}
		} else {
			System.out.println("�����ε������߱�����������");
		}
	}
}