package com.han.fin;

import java.util.Scanner;
/**
 * final���ζ���
 * @author Administrator
 *
 */
public final class CatDemo {

static String cat;

public static void main(String[] args) {
	System.out.println("������Сè�����֣�");
	Scanner shuru =new Scanner(System.in);
	cat=shuru.nextLine();
	final String cat="С��";
	CatDemo cd=new CatDemo();
	System.out.println(cat);
}
}