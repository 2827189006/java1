package cn.charpter8.demo;

public class Demo {

	/**
	 * 方法一
	 */
	public static void main(String[] args) {
		//Test();
		int a=2,b=3;
		int sum=0;
		sum=a+b;
		System.out.println("两个数的和是："+sum);
		long sum1=Test3(20);
		System.out.println(sum1);
		sum(20);
		
	}
	
	//没有返回值的方法，并且也没有参数
/*	public static void Test()
	{
		System.out.println("马上要考试了，你们自己好自为之吧！！！");
	}
	
	public static void Test2(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("两个数的和是："+sum);
	}*/
	public static long Test3(long n)
	{
		//1!=1  2!=2*1  3!=3*2*1
		long m=1;
		for(int i=1;i<=n;i++)
		{
			m=m*i;
		}
		//System.out.println(m);
		return m;
	}
	
	public static void sum(long n)
	{
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			long t=Test3(i);
			sum+=t;
			//System.out.println(t);
		}
		System.out.println(sum);
	}
}
