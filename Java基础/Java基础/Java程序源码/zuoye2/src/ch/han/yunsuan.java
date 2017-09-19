package ch.han;

import java.util.Scanner;

public class yunsuan {
	private static int a;
	private static int b;

	public static void main(String[] args) {
		 /*System.out.println("请输入数字a:");
		 System.out.println("请输入数字b:");*/
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("请输入数字a:\n"+a);
		 System.out.println("请输入数字b\n"+b);
     try{
    	 int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
    	 System.out.println("结果为："+a/b);
     }catch(ArrayIndexOutOfBoundsException e){
    	 System.out.println("b不能为0，请输入其他数字");
     }catch(NumberFormatException e){
    	 System.out.println("输入的a或b有不是数字，请检查输入正确的数字");
     }
         System.out.println("end!");
	
	}

}
