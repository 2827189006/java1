package ch.han;

import java.util.Scanner;

public class yunsuan {
	private static int a;
	private static int b;

	public static void main(String[] args) {
		 /*System.out.println("����������a:");
		 System.out.println("����������b:");*/
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("����������a:\n"+a);
		 System.out.println("����������b\n"+b);
     try{
    	 int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
    	 System.out.println("���Ϊ��"+a/b);
     }catch(ArrayIndexOutOfBoundsException e){
    	 System.out.println("b����Ϊ0����������������");
     }catch(NumberFormatException e){
    	 System.out.println("�����a��b�в������֣�����������ȷ������");
     }
         System.out.println("end!");
	
	}

}
