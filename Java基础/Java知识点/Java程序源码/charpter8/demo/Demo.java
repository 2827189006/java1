package cn.charpter8.demo;

public class Demo {

	/**
	 * ����һ
	 */
	public static void main(String[] args) {
		//Test();
		int a=2,b=3;
		int sum=0;
		sum=a+b;
		System.out.println("�������ĺ��ǣ�"+sum);
		long sum1=Test3(20);
		System.out.println(sum1);
		sum(20);
		
	}
	
	//û�з���ֵ�ķ���������Ҳû�в���
/*	public static void Test()
	{
		System.out.println("����Ҫ�����ˣ������Լ�����Ϊ֮�ɣ�����");
	}
	
	public static void Test2(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("�������ĺ��ǣ�"+sum);
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
