package cn.baidu;

import java.util.Scanner;

public class Test2 {

	/**
	 * if...else
	 */
	public static void main(String[] args) {
		//int i = 10;
		/*if(i<20){
			System.out.println("i��ֵС��20");
		}else if(i>20){
			System.out.println("i��ֵС��10");
		}else{
			System.out.println("����������������");
		}*/
		/*if(i++>10){
			;
		}
		System.out.println(i);
		System.out.println(i);*/
		
		//�Ӽ�����������������Ȼ������������Ӵ�С����(��if...else...)
		Scanner in=new Scanner(System.in);
		System.out.println("�������һ����:");
		int a=in.nextInt();
		System.out.println("������ڶ�����:");
		int b=in.nextInt();
		System.out.println("�������������:");
		int c=in.nextInt();
		
		//���ֵ 5 8 6
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
		
		//����
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
