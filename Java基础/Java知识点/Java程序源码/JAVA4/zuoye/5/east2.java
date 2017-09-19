package cn.diao;

import java.util.Scanner;

public class east2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入里程数：");
		double a=scan.nextDouble();
		Scanner scan1=new Scanner(System.in);
		System.out.println("请输入等待时间：");
		double b=scan.nextDouble();
		if(a<=3)
		{
			System.out.println("应付车费为:"+(int)(10+b/2.5));			
		}
		else if(a<=15)
		{
			System.out.println("应付车费为:"+(int)(10+b/2.5+(a-3)/0.5));
		}
		else
		{
			System.out.println("应付车费为:"+(int)(10+b/2.5+(a-3)/0.5)+(10+b/2.5+(a-3)/0.5)*0.5);
		}
	}

}
