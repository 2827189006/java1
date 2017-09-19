package cn.charpter8;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// 编写程序求1！+2！+....20！的和并显示，要求使用方法完成
		System.out.println("===================================================================");
		System.out.println(" 编写程序求1！+2！+....20！的和并显示，要求使用方法完成");
		System.out.println("使用方法的递归调用：");
		System.out.println(SUM(4));
		System.out.println("使用循环语句：");
		System.out.println(SUM1(20));
/*		System.out.println("===================================================================");
		System.out.println("输入一个数字，求它的二进制，八进制，十六进制(用方法来做)");
		System.out.println("请输入一个十进制的正整数：");
		int num=scanner.nextInt();
		System.out.println("请输出要转换的进制(如2,8,16)：");
		 String str=scanner.next();
		num1(num,str);*/
/*		System.out.println("===================================================================");
		System.out.println("编写一个程序，输入n是偶数，调用1/2+1/4+…+1/n; 当时奇数时,调用1/1+1/3+…+1/n(调用方法)");
		System.out.println("请输入一个正整数：");
		int num1=scanner.nextInt();
		SUM2(num1);*/
/*		System.out.println("===================================================================");
		System.out.println("使用递归调用实现1+2+……+n的和");
		System.out.println("请输入一个正整数：");
		int n=scanner.nextInt();
		int sum=SUM3(n);
		System.out.println(sum);*/
	}
	
	//使用方法的递归调用
	/**
	 * 使用方法的递归调用求n!
	 * */
	public static long fac(long n) {
		if (n==0||n==1) {
			return 1;
		}else {
			return n*fac(n-1);
		}
	}
	/**
	 * 使用方法的递归调用求1!+2!+3!....+n!的和
	 * */
	public static long SUM(long n)
	{
		long sum=0;
		if(n==1)
		{
			return sum=fac(n);
		}
		if(n>1)
		{
		sum=SUM(n-1)+fac(n);
		}
		return sum ;
	}

	//使用循环
	/**
	 * 使用循环求出n!
	 * */
	public static long fac1(long n)
	{
		long f=0;
		for(long i=0;i<=n;i++)
		{
			if(i==0||i==1)
			{
				f=1;
			}else {
				f*=i;
			}
		}
		return f;
	}
	/**
	 * 使用方循环求1!+2!+3!....+n!的和
	 * */
	public static long SUM1(long n)
	{
		long sum=0;
		for(long i=1;i<=n;i++)
		{
			sum+=fac1(i);
		}
		return sum;
	}
	
//	2、	输入一个数字，求它的二进制，八进制，十六进制(用方法来做)
	/**
	 * 输入一个数字，求它的二进制，八进制，十六进制(用方法来做)
	 * */
	public static void num1(int n,String str)
	{
		int num=Integer.parseInt(str);
	    	
	    	int trade=n/num;//声明一个变量来存储商
	    	int r=n%num;//声明一个变量来存储余数
	    	String strResult=String.valueOf(r);//用来存储最后得到的结果
	    	while (trade!=0) {
	    		r=trade%num;
				trade=trade/num;
				strResult+=r;
			}
	    	StringBuffer sb=new StringBuffer(strResult);
	    	sb.reverse();
	    	System.out.println("转换成"+num+"进制数是："+sb);
	}
	
//	3、	编写一个程序，输入n是偶数，调用1/2+1/4+…+1/n; 当时奇数时,调用1/1+1/3+…+1/n(调用方法)
	/**
	 * 编写一个程序，输入n是偶数，调用1/2+1/4+…+1/n; 当时奇数时,调用1/1+1/3+…+1/n(调用方法)
	 * */
	         public static void SUM2(int n) {
				if(n%2==0)
				{
					System.out.println("当n为偶数时，1/2+1/4+…+1/n的和是："+even(n));
				}
				else {
					System.out.println("当n为奇数时，1/1+1/3+…+1/n的和是："+odd(n));
				}
			}
	         /**
	          * 当n为偶数时
	          * */
	         public static double even(int n) {//当n为偶数时
	        	double sum=0;
				if(n%2==0)
				{
					for(int i=1;i<=n;i++)
					{
						if(i%2==0)
						{
							sum+=(double)1/i;
						}
					}
				}
				return sum;
			}
	         /**
	          * 当n为奇数时
	          * */
	         public static double odd(int n) {//当n为奇数时
		        	double sum=0;
					if(n%2==1)
					{
						for(int i=1;i<=n;i++)
						{
							if(i%2==1)
							{
								sum+=(double)1/i;
							}
						}
					}
					return sum;
				}
	         
	         public static double fun(double n){
	        	 return n<0?0:1/n+fun(n-2);
	         }
	
//	4、	使用递归调用实现1+2+……+n的和
	         /**
	          * 使用递归调用实现1+2+……+n的和
	          * */
	         public static int SUM3(int n) {
	        	 int sum=0;
	        	 if(n>0)
	        	 {
	        		 sum=n+SUM3(n-1);
	        	 }
				return sum;
			}
//	5、	编写一个程序，在控制台输入一些数字，去掉重复数字，然后将这些数字从小到大排列（用方法实现）
/*	public static void Test(String str) {
		char[]ch=str.toCharArray();
		for()
	}*/
	
}
