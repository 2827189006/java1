package com.han.demo;

import java.util.Scanner;

/**
 * 
 * @author if-else分支
 *
 */
public class PayDemo {
	public static void main(String[] args){
		float pay=0;//周薪水
		int rate=55;//时薪水
		int hours;//周工作小时
		Scanner shuru=new Scanner(System.in);
		System.out.println("请输入员工一周的工作时长");
		hours=shuru.nextInt();
		//计算工资的算法
		if (hours<40) {
			pay=hours*rate;
		}
		else {
			pay=40*rate+1.5f*(hours-40)*rate;
		}
		System.out.println("该员工的上周工资为"+pay);
	}
}
