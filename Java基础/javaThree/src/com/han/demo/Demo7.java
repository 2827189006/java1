package com.han.demo;

import java.util.Scanner;
/**
 * ��ֵ���ʽ���������ʽ
 * @author Administrator
 *
 */
public class Demo7 {
	public static void main(String[] args) {
	int a,b;//�������
	System.out.println("������a��ֵ��");
	Scanner shuru=new Scanner(System.in);
	a=shuru.nextInt();
	System.out.println("������b��ֵ��");
	Scanner shuru1=new Scanner(System.in);
	b=shuru.nextInt();

	//������
	System.out.println("��Ϊ��"+(a+b));
	System.out.println("��Ϊ��"+(a-b));
	System.out.println("��Ϊ:"+(a*b));
	System.out.println("��Ϊ:"+(a/b));
	System.out.println("����Ϊ:"+(a%b));
}
}
