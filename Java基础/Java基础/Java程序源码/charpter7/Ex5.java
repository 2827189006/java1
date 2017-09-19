package cn.charpter8;

import java.util.Scanner;

public class Ex5 {
//	5、	编写一个程序，在控制台输入一些数字，去掉重复数字，然后将这些数字从小到大排列（用方法实现）
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一串数字：");
		String str=scanner.nextLine();
		print(str);
	}

	//讲一个字符串拆分成一个数组，并将重复的元素的值改成a
	public static char[] getArray(String str) {
		char[]oldArr=str.toCharArray();
		System.out.println("原数组的长度是："+oldArr.length);		
		for(int i=0;i<oldArr.length-1;i++)
		{
			for(int j=i+1;j<oldArr.length;j++)
			{
				if(oldArr[i]==oldArr[j])//判断两个数的值是否相等，相等的话表示有重复的，把重复的元素的值变成a
				{
					oldArr[i]='a';
				}
			}
		}
		return oldArr;//返回一个数组
	}
	//把不重复的元素放在一个新的数组中
	public static char[] getNewArray(String str) {
		char [] oldArr=getArray(str);//调用方法
		int count=0;//用来计算元素值为a的个数
		for(int i=0;i<oldArr.length;i++)
		{
			if(oldArr[i]=='a')
			{
				count++;
			}
//			System.out.print(ch[i]+" ");
		}
		int num=oldArr.length-count;//新的数组的长度就是原来数组的长度-重复的元素的个数
		char newArr[]=new char[num];
		num=0;
		for(int i=0;i<oldArr.length;i++)
		{
				if(oldArr[i]!='a')
				{
					newArr[num]=oldArr[i];//把原来数组中不是a的元素的值赋值给新的数组中的元素
					num++;
				}
		}
		return newArr;
	}
	//按升序将新数组中的元素输出
	public static void print(String str) {
		char []newArr=getNewArray(str);
		//给新的数组进行排序
		for(int i=1;i<=newArr.length-1;i++)
		{
			for(int j=0;j<newArr.length-i;j++)
			{
				if(newArr[j]>newArr[j+1])
				{
					char temp=' ';
					temp=newArr[j];
					newArr[j]=newArr[j+1];
					newArr[j+1]=temp;
				}
			}
		}
		//循环输出新的数组
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}
