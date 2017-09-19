package ch.han;

import java.util.Scanner;

public class dengluyemian {
	private static Object shuru;

	public static void main(String[] args) {
	System.out.println("欢迎使用中国建行ATM");
    System.out.println("       张先生您好    ");
    Scanner scanner=new Scanner(System.in);
    System.out.println("请选择操作：");
    try{
	int shu=scanner.nextInt();
    if(shu==1){
    	System.out.println("取款");
    }else if(shu==2){
    	System.out.println("查询");
    }else if(shu==3){
    	System.out.println("实时存款");
    }else if(shu==4){
    	System.out.println("缴费");
    }else if(shu==5){
    	System.out.println("转账");
    }else if(shu==6){
    	System.out.println("退出");
    }
    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("输入有误，请重新输入"+e.toString());
    }catch(NumberFormatException e){
	   System.out.println("输入不是整数，请重新输入"+e.toString());
   }catch(Exception e){
	   System.out.println("输入不是整数，请重新输入"+e.toString());
   }
  }
}
