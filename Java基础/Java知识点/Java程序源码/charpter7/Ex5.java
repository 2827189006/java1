package cn.charpter8;

import java.util.Scanner;

public class Ex5 {
//	5��	��дһ�������ڿ���̨����һЩ���֣�ȥ���ظ����֣�Ȼ����Щ���ִ�С�������У��÷���ʵ�֣�
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		String str=scanner.nextLine();
		print(str);
	}

	//��һ���ַ�����ֳ�һ�����飬�����ظ���Ԫ�ص�ֵ�ĳ�a
	public static char[] getArray(String str) {
		char[]oldArr=str.toCharArray();
		System.out.println("ԭ����ĳ����ǣ�"+oldArr.length);		
		for(int i=0;i<oldArr.length-1;i++)
		{
			for(int j=i+1;j<oldArr.length;j++)
			{
				if(oldArr[i]==oldArr[j])//�ж���������ֵ�Ƿ���ȣ���ȵĻ���ʾ���ظ��ģ����ظ���Ԫ�ص�ֵ���a
				{
					oldArr[i]='a';
				}
			}
		}
		return oldArr;//����һ������
	}
	//�Ѳ��ظ���Ԫ�ط���һ���µ�������
	public static char[] getNewArray(String str) {
		char [] oldArr=getArray(str);//���÷���
		int count=0;//��������Ԫ��ֵΪa�ĸ���
		for(int i=0;i<oldArr.length;i++)
		{
			if(oldArr[i]=='a')
			{
				count++;
			}
//			System.out.print(ch[i]+" ");
		}
		int num=oldArr.length-count;//�µ�����ĳ��Ⱦ���ԭ������ĳ���-�ظ���Ԫ�صĸ���
		char newArr[]=new char[num];
		num=0;
		for(int i=0;i<oldArr.length;i++)
		{
				if(oldArr[i]!='a')
				{
					newArr[num]=oldArr[i];//��ԭ�������в���a��Ԫ�ص�ֵ��ֵ���µ������е�Ԫ��
					num++;
				}
		}
		return newArr;
	}
	//�������������е�Ԫ�����
	public static void print(String str) {
		char []newArr=getNewArray(str);
		//���µ������������
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
		//ѭ������µ�����
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}
