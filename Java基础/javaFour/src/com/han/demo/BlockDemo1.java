package com.han.demo;
/**
 * 
 * @authork 块作用域
 *
 */
public class BlockDemo1 {
	
public static void main(String[] args) {
		
	{
		int bookPrice=23;
		System.out.println("bookPrice="+bookPrice);
	}
	int bookPrice=1;
	System.out.println("bookPrice="+bookPrice);//代码块内部事务变量不能被外部使用
}
}
