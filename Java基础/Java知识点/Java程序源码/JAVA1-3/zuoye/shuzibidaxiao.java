package cn.baidu;

import java.util.Scanner;

public class Test2 {

	/**
	 * if...else
	 */
	public static void main(String[] args) {
		//int i = 10;
		/*if(i<20){
			System.out.println("i的值小于20");
		}else if(i>20){
			System.out.println("i的值小于10");
		}else{
			System.out.println("以上条件都不满足");
		}*/
		/*if(i++>10){
			;
		}
		System.out.println(i);
		System.out.println(i);*/
		
		//从键盘上输入三个数，然后把这三个数从大到小排列(用if...else...)
		Scanner in=new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a=in.nextInt();
		System.out.println("请输入第二个数:");
		int b=in.nextInt();
		System.out.println("请输入第三个数:");
		int c=in.nextInt();
		
		//最大值 5 8 6
		/*if(max<b){
			max=b;
		}
		if(max<c){
			max=c;
		}*/
		//6 9 5
		/*int max=a>b?a:b;
		max=max>c?max:c;*/
		System.out.println((a>b?a:b)>c?(a>b?a:b):c);
		
		//排序
		/*if(a<b){
			if(c<a){
				System.out.println("c<a<b");
			}else if(b<c){
				System.out.println("a<b<c");
			}else{
				System.out.println("a<c<b");
			}
		}else{
			if(c<b){
				System.out.println("c<b<a");
			}else if(a<c){
				System.out.println("b<a<c");
			}else{
				System.out.println("b<c<a");
			}
		}*/
	
	}

}
