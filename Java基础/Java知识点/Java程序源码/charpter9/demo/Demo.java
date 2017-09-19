package cn.charpter9.demo;

import java.util.Scanner;

public class Demo {

	/**
	 * 方法二
	 */
	static int c=9;
	public static void main(String[] args) {
		//变量的作用域
/*		int a=9;
		{
		int b=10;
		System.out.println(b);
		}
		Demo demo=new Demo();
		System.out.println(demo.c);*/
		//System.out.println(b);
/*		int [] arr={1,2,3,4,5,6};
		NUM(arr);
		int b=10;
		Test(b);*/
/*		Scanner scanner=new Scanner(System.in);
		scanner.next();*/
		
		int x=9,y=10;
/*		System.out.println("调用方法之前：x="+x+" y="+y);
		exchangeNum(x,y);
		System.out.println("调用方法之后：x="+x+" y="+y);*/
		/*exchange(x, y);
		System.out.println("调用方法之后：x="+x+" y="+y);
		*/
		
		int [] arr={2,3};
		System.out.println("调用方法之前，arr[0]="+arr[0]+"  arr[1]="+arr[1]);
/*		exchangeNum1(arr);
		System.out.println("调用方法之后，arr[0]="+arr[0]+"  arr[1]="+arr[1]);*/
		//exchange1(arr);
		Demo2.exchange1(arr);
		cn.charpter8.demo.Demo1.age(2);
		System.out.println("调用方法之后，arr[0]="+arr[0]+"  arr[1]="+arr[1]);
		
	}
	public static void name() {
		System.out.println(c);
	}
	//a=10;
	
	public static void Test(int a)
	{
		System.out.println(a);
	}
	
	
	//使用数组作为方法的参数
	
	public static void NUM(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	//值传递
	public static void exchangeNum(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
	}
	public static void exchange(int a,int b) {
		a=10;
		b=30;
	}
	
	//引用传递
    public static void  exchangeNum1(int [] arr) {
		int temp=0;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}


    //可变参数
    public static void Test(Double b,int... n) {
    	n[0]=10;
		
	}
}
