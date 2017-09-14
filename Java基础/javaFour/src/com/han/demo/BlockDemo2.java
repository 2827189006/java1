package com.han.demo;
/**
 * 
 * @authork 块作用域
 *
 */
public class BlockDemo2 {
	
public static void main(String[] args) {
	int bookPrice=23;
	{
		int bookPrice1=20;//变量重复定义了，把变量名改一个就能使用，输出的字符串最好也改一下好区分。
		System.out.println("bookPrice1="+bookPrice1);
	}
	System.out.println("bookPrice="+bookPrice);		
}
}
