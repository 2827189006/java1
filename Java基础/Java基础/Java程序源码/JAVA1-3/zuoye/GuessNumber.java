package 游戏;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public GuessNumber(){	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int userInput=scanner.nextInt();
		System.out.println("您输入的数字为："+userInput);
       int times=1;
       while(true){
    	   Random random=new Random();
    	   int randomNumber=random.nextInt(100);
    	   System.out.println("第"+times+"次,系统产生的随机数为："+randomNumber);
    	   if(userInput==randomNumber){
    		   System.out.println("您猜对了,一共猜了"+times+"次");
    		   break;
    	   }
    	   times++;
       }
	}

}
