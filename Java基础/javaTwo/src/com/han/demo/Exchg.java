package com.han.demo;

public class Exchg {
public static void main(String[] args) {
	//����֮��Ľ���
	int num1=10,num2=12;
	int temp;//�м����
	System.err.println("����ǰ����������ֵ��");
	System.out.println("num1="+num1+"\t"+"num2="+num2);
	temp=num1;
	num1=num2;
	temp=num2;
	System.err.println("����������������ֵ��");
	System.out.println("num1="+num1+"\t"+"num2="+num2);
}
}
