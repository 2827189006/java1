package com.han.demo;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner shuru=new Scanner(System.in);//定义scanner录入
	System.out.println("请输入Java的发展寿命：");
	int age=shuru.nextInt();//定义scanner录入的接收变量名
	System.out.println("请输入Java的别名：");
	int name=shuru.nextInt();//定义scanner录入的接收变量名
	System.out.println("请输入Java的价格是：");
	int pice=shuru.nextInt();//定义scanner录入的接收变量名
	System.out.println("java的发展寿命是"+age);
	System.out.println("java的别名是"+name);
	System.out.println("java的价格是"+pice);
}
}
