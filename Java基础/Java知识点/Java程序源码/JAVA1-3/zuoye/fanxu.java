package zuoye;

import java.util.Scanner;

public class fanxu {


	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("请输入任意字符串：");
		StringBuffer n=new StringBuffer(input.next());
		n.reverse();
		System.out.print("反序为：");
	    System.out.println(n);
	}	
}


