package ��Ϸ;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public GuessNumber(){	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int userInput=scanner.nextInt();
		System.out.println("�����������Ϊ��"+userInput);
       int times=1;
       while(true){
    	   Random random=new Random();
    	   int randomNumber=random.nextInt(100);
    	   System.out.println("��"+times+"��,ϵͳ�����������Ϊ��"+randomNumber);
    	   if(userInput==randomNumber){
    		   System.out.println("���¶���,һ������"+times+"��");
    		   break;
    	   }
    	   times++;
       }
	}

}
