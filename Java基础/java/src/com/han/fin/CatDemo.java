package com.han.fin;

import java.util.Scanner;
/**
 * final修饰对象
 * @author Administrator
 *
 */
public final class CatDemo {

static String cat;

public static void main(String[] args) {
	System.out.println("请输入小猫的名字：");
	Scanner shuru =new Scanner(System.in);
	cat=shuru.nextLine();
	final String cat="小花";
	CatDemo cd=new CatDemo();
	System.out.println(cat);
}
}