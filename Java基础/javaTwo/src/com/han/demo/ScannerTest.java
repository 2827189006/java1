package com.han.demo;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner shuru=new Scanner(System.in);//����scanner¼��
	System.out.println("������Java�ķ�չ������");
	int age=shuru.nextInt();//����scanner¼��Ľ��ձ�����
	System.out.println("������Java�ı�����");
	int name=shuru.nextInt();//����scanner¼��Ľ��ձ�����
	System.out.println("������Java�ļ۸��ǣ�");
	int pice=shuru.nextInt();//����scanner¼��Ľ��ձ�����
	System.out.println("java�ķ�չ������"+age);
	System.out.println("java�ı�����"+name);
	System.out.println("java�ļ۸���"+pice);
}
}
