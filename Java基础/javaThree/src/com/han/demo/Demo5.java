package com.han.demo;

/**
 * �߼�����
 * 
 * @author Administrator
 */
public class Demo5 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 7;
		boolean r1,r2,r3; 
		r1=(a>b)&&(c>=b);// a>bΪ�٣������巵�ؼ�
			System.out.println("\nr1="+r1);

		r2=(a>b)||(c>=b);//a>bΪ������巵����
		System.out.println("\nr2="+r2);
		r3=!r2;
		System.out.println("\nr3="+r3);
		}
	}