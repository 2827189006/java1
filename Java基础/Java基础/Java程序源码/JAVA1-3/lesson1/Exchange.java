import java.util.Scanner;

public class Exchange{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入任意整数：");
	StringBuffer n=new StringBuffer(input.next());
	n.reverse();
	System.out.print("反序为：");
    System.out.println(n);
	}
	}

