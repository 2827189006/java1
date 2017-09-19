package test;

import java.util.Scanner;

public class EnterMain {

	private Scanner sc=new Scanner(System.in);
	private StudentServic ss=new StudentServic();
	static Student  stu;
/**
 * 进入主页面
 * @param ss 
 * */
	public void showMain() {
		System.out.println("\t         书店管理销售系统                   ");
		System.out.println("*********************************");
		System.out.println("           1.登陆系统                                 ");
		System.out.println("           2.会员注册申请                       ");
		System.out.println("           3.退        出                                   ");
		System.out.println("*********************************");
		System.out.println("请选择操作：");
		String input=sc.next();
		if("1".equals(input)){
			System.out.println("进入用户登陆！");
			stu=ss.login();
			if(stu==null){
				System.out.println("三次登陆失败，被迫退出系统");
			}else{
				System.out.println("登陆成功");
				switch ( stu.getStatus()){
				case 1:
					System.out.println("会员登陆");
					break;
				case 2:
				System.out.println("管理员登陆！");
				break;
				}
			}
		}else if("2".equals(input)){
			System.out.println("会员注册");
		}else if("3".equals(input)){
			System.out.println("欢迎下次光临！");
		}else{
			System.out.println("您输入的不正确，请重新输入！");
			this.showMain();
		}
	}
}
