package ch.han;

import java.util.Scanner;

public class CCircle {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
        System.out.println("������r��");
	try{
	double  r=scanner.nextInt();
    double area=r*r*3.14;
	}catch(NumberFormatException e){
	System.out.println("r��ֵ����Ϊ����������������");
	}
	}
}
