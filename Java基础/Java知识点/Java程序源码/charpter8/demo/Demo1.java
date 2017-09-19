package cn.charpter8.demo;

public class Demo1 {

	/**
	 * 方法的递归调用
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(age(5));
	}
	
	public static long fac(long n)
	{
		long f=0;//用来存储一个数的阶乘
		if(n==1||n==0)
		{
			f=1;
		}
		else if (n>1) {
			f=n*fac(n-1);//n=5;f=5*fac(4)   n=4; f=4*fac(3) n=3; f=3*fac(2) n=2; f=2*fac(1)   n=1:f=1
		}
		return f;
	}
	
	
	public static int age(int n)
	{
		int age=0;
		if(n==1)
		{
			age=10;
		}
		else if (n>1) {
			age=age(n-1)+2;
		}
		return age;
	}

}
