package cn.diao;
import java.util.Scanner;
public class east3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学生成绩");
		double score = scan.nextDouble();
		switch((int)score/10){
			case 10:
			case 9:
				System.out.println("A级");
				break;
			case 8:
				System.out.println("B级");
				break;
			case 7:
				System.out.println("C级");
				break;
			case 6:	
				System.out.println("D级");
				break;
			default:
				System.out.println("E级");
		}
	}

}
