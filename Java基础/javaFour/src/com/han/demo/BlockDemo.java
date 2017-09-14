package com.han.demo;
/**
 * 
 * @authork ¿é×÷ÓÃÓò
 *
 */
public class BlockDemo {
	
public static void main(String[] args) {
	int bookPrice=23;
	System.out.println("bookPrice="+bookPrice);
	{
		bookPrice--;
		System.out.println("bookPrice="+bookPrice);
	}
	System.out.println("bookPrice="+bookPrice);
}
}
