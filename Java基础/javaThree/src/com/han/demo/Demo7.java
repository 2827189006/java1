package com.han.demo;

import java.util.Scanner;
/**
 * 赋值表达式和算术表达式
 * @author Administrator
 *
 */
public class Demo7 {
	public static void main(String[] args) {
	int a,b;//定义变量
	System.out.println("请输入a的值：");
	Scanner shuru=new Scanner(System.in);
	a=shuru.nextInt();
	System.out.println("请输入b的值：");
	Scanner shuru1=new Scanner(System.in);
	b=shuru.nextInt();

	//输出结果
	System.out.println("和为："+(a+b));
	System.out.println("差为："+(a-b));
	System.out.println("积为:"+(a*b));
	System.out.println("商为:"+(a/b));
	System.out.println("余数为:"+(a%b));
}
}
