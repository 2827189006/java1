package cn.charpter8;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// ��д������1��+2��+....20���ĺͲ���ʾ��Ҫ��ʹ�÷������
		System.out.println("===================================================================");
		System.out.println(" ��д������1��+2��+....20���ĺͲ���ʾ��Ҫ��ʹ�÷������");
		System.out.println("ʹ�÷����ĵݹ���ã�");
		System.out.println(SUM(4));
		System.out.println("ʹ��ѭ����䣺");
		System.out.println(SUM1(20));
/*		System.out.println("===================================================================");
		System.out.println("����һ�����֣������Ķ����ƣ��˽��ƣ�ʮ������(�÷�������)");
		System.out.println("������һ��ʮ���Ƶ���������");
		int num=scanner.nextInt();
		System.out.println("�����Ҫת���Ľ���(��2,8,16)��");
		 String str=scanner.next();
		num1(num,str);*/
/*		System.out.println("===================================================================");
		System.out.println("��дһ����������n��ż��������1/2+1/4+��+1/n; ��ʱ����ʱ,����1/1+1/3+��+1/n(���÷���)");
		System.out.println("������һ����������");
		int num1=scanner.nextInt();
		SUM2(num1);*/
/*		System.out.println("===================================================================");
		System.out.println("ʹ�õݹ����ʵ��1+2+����+n�ĺ�");
		System.out.println("������һ����������");
		int n=scanner.nextInt();
		int sum=SUM3(n);
		System.out.println(sum);*/
	}
	
	//ʹ�÷����ĵݹ����
	/**
	 * ʹ�÷����ĵݹ������n!
	 * */
	public static long fac(long n) {
		if (n==0||n==1) {
			return 1;
		}else {
			return n*fac(n-1);
		}
	}
	/**
	 * ʹ�÷����ĵݹ������1!+2!+3!....+n!�ĺ�
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

	//ʹ��ѭ��
	/**
	 * ʹ��ѭ�����n!
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
	 * ʹ�÷�ѭ����1!+2!+3!....+n!�ĺ�
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
	
//	2��	����һ�����֣������Ķ����ƣ��˽��ƣ�ʮ������(�÷�������)
	/**
	 * ����һ�����֣������Ķ����ƣ��˽��ƣ�ʮ������(�÷�������)
	 * */
	public static void num1(int n,String str)
	{
		int num=Integer.parseInt(str);
	    	
	    	int trade=n/num;//����һ���������洢��
	    	int r=n%num;//����һ���������洢����
	    	String strResult=String.valueOf(r);//�����洢���õ��Ľ��
	    	while (trade!=0) {
	    		r=trade%num;
				trade=trade/num;
				strResult+=r;
			}
	    	StringBuffer sb=new StringBuffer(strResult);
	    	sb.reverse();
	    	System.out.println("ת����"+num+"�������ǣ�"+sb);
	}
	
//	3��	��дһ����������n��ż��������1/2+1/4+��+1/n; ��ʱ����ʱ,����1/1+1/3+��+1/n(���÷���)
	/**
	 * ��дһ����������n��ż��������1/2+1/4+��+1/n; ��ʱ����ʱ,����1/1+1/3+��+1/n(���÷���)
	 * */
	         public static void SUM2(int n) {
				if(n%2==0)
				{
					System.out.println("��nΪż��ʱ��1/2+1/4+��+1/n�ĺ��ǣ�"+even(n));
				}
				else {
					System.out.println("��nΪ����ʱ��1/1+1/3+��+1/n�ĺ��ǣ�"+odd(n));
				}
			}
	         /**
	          * ��nΪż��ʱ
	          * */
	         public static double even(int n) {//��nΪż��ʱ
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
	          * ��nΪ����ʱ
	          * */
	         public static double odd(int n) {//��nΪ����ʱ
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
	
//	4��	ʹ�õݹ����ʵ��1+2+����+n�ĺ�
	         /**
	          * ʹ�õݹ����ʵ��1+2+����+n�ĺ�
	          * */
	         public static int SUM3(int n) {
	        	 int sum=0;
	        	 if(n>0)
	        	 {
	        		 sum=n+SUM3(n-1);
	        	 }
				return sum;
			}
//	5��	��дһ�������ڿ���̨����һЩ���֣�ȥ���ظ����֣�Ȼ����Щ���ִ�С�������У��÷���ʵ�֣�
/*	public static void Test(String str) {
		char[]ch=str.toCharArray();
		for()
	}*/
	
}
