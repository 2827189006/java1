package ch.han;

import java.util.Scanner;

public class dengluyemian {
	private static Object shuru;

	public static void main(String[] args) {
	System.out.println("��ӭʹ���й�����ATM");
    System.out.println("       ����������    ");
    Scanner scanner=new Scanner(System.in);
    System.out.println("��ѡ�������");
    try{
	int shu=scanner.nextInt();
    if(shu==1){
    	System.out.println("ȡ��");
    }else if(shu==2){
    	System.out.println("��ѯ");
    }else if(shu==3){
    	System.out.println("ʵʱ���");
    }else if(shu==4){
    	System.out.println("�ɷ�");
    }else if(shu==5){
    	System.out.println("ת��");
    }else if(shu==6){
    	System.out.println("�˳�");
    }
    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("������������������"+e.toString());
    }catch(NumberFormatException e){
	   System.out.println("���벻������������������"+e.toString());
   }catch(Exception e){
	   System.out.println("���벻������������������"+e.toString());
   }
  }
}
