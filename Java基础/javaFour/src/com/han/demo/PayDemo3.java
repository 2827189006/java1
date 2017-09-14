package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author switch分支语句
 *
 */
public class PayDemo3 {
	public static void main(String[] args) {
		int num1=10,num2=3,restl;
	     String line;
	     char sifn;
		Scanner shuru = new Scanner(System.in);
		System.out.println("num1="+num1+",num2="+num2);
		System.out.println("请输入运算符号");
		line = shuru.nextLine();//读取第一行数据
		sifn=line.charAt(0);//获得字符串的第一个字符
		switch (sifn) {
		case '+':
			restl=num1+num2;
			break;
		case '-':
			restl=num1-num2;
			break;
		case '*':
			restl=num1*num2;
			break;
		case '/':
			restl=num1/num2;
			break;
		case '%':
			restl=num1%num2;
			break;
		default:
			System.out.println("运算符号错误！");
			restl=-1;//若运算错误，结果为-1
			
		}
		System.out.println("num1"+sifn+"num2="+restl);
	}
}
