package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author switch��֧���
 *
 */
public class PayDemo3 {
	public static void main(String[] args) {
		int num1=10,num2=3,restl;
	     String line;
	     char sifn;
		Scanner shuru = new Scanner(System.in);
		System.out.println("num1="+num1+",num2="+num2);
		System.out.println("�������������");
		line = shuru.nextLine();//��ȡ��һ������
		sifn=line.charAt(0);//����ַ����ĵ�һ���ַ�
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
			System.out.println("������Ŵ���");
			restl=-1;//��������󣬽��Ϊ-1
			
		}
		System.out.println("num1"+sifn+"num2="+restl);
	}
}
