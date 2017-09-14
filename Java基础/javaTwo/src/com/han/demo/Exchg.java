package com.han.demo;

public class Exchg {
public static void main(String[] args) {
	//变量之间的交换
	int num1=10,num2=12;
	int temp;//中间变量
	System.err.println("交换前两个变量的值：");
	System.out.println("num1="+num1+"\t"+"num2="+num2);
	temp=num1;
	num1=num2;
	temp=num2;
	System.err.println("交换后两个变量的值：");
	System.out.println("num1="+num1+"\t"+"num2="+num2);
}
}
