package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author if-else��֧
 *
 */
public class PayDemo {
	public static void main(String[] args){
		float pay=0;//��нˮ
		int rate=55;//ʱнˮ
		int hours;//�ܹ���Сʱ
		Scanner shuru=new Scanner(System.in);
		System.out.println("������Ա��һ�ܵĹ���ʱ��");
		hours=shuru.nextInt();
		//���㹤�ʵ��㷨
		if (hours<40) {
			pay=hours*rate;
		}
		else {
			pay=40*rate+1.5f*(hours-40)*rate;
		}
		System.out.println("��Ա�������ܹ���Ϊ"+pay);
	}
}
