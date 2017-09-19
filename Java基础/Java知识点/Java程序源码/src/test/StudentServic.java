package test;

import java.util.Scanner;

public class StudentServic {
private Scanner sc=new Scanner(System.in);
private StudentDao sd=new StudentDaoImp1();
/**
 * 判断用户登陆
 * 如果登陆进入返回Student对象
 * @param sc 
 * */
	public Student login() {
		Student stu=null;
		int num=0;
		while(num<=3){
			System.out.println("请输入用户名:");
			String username=sc.next();
			System.out.println("请输入密码:");
			String password=sc.next();
			//如果数据库中没有这条记录,stu值是null
			stu=sd.findstudent(username, password);
			if(stu==null){
				num++;
				System.out.println("用户密码输入错误，您还有"+(3-num)+"次机会登陆。");
			}else{
				System.out.println("密码三次输入错误，系统被迫退出 ！");
				break;
			}
		}
		return stu;
	}
	/**
	 * 调用普通用户注册
	 * */
public void	register(){
	System.out.println("***********************************");
	System.out.println("*       欢迎来到6-2班书店注册                 *");
	System.out.println("***********************************");
	System.out.println("*          请输入您的姓名                           *");
	String sname=sc.next();
	System.out.println("*          请输入您的年龄：                     * ");
	int sage=0;
	while(true){
		try {
			String s=sc.next();
			sage=Integer.parseInt(s);
			if(sage<0||sage>120){
				throw new RuntimeException();
			}break;
		} catch (Exception e) {
			System.out.println("您输入的年龄有误，请重新输入 ：");
		}
	}
	System.out.println("请输入您的性别 ：");
	String ssex=sc.next();
	while(!("男".equals(ssex))||"女".equals(ssex)){
		System.out.println("您输入的性别有误 ，请重新输入：");
		ssex=sc.next();
	}
  System.out.println("请输入您的初始注册资金：");
  double balance=0;
  try {
	balance=sc.nextDouble();
	if(balance<0||balance>10000000){
		throw new RuntimeException();
	}
} catch (Exception e) {
System.out.println("您输入的金额有误，请重新输入：");
}
//用户名和密码
  System.out.println("请输入您的用户名：");
  String unsername=sc.next();
  System.out.println("请输入您的密码：");
  String passerword=sc.next();
  Student stu=new Student(sname,sage,ssex,unsername,passerword,balance);
  stu.setStatus(0);
//保存到数据库
  sd.addStudent(stu);
  System.out.println("**********************************/");
  System.out.println("*注册成功，我们会尽快通知管理员通过！ *");
  System.out.println("**********************************/");
}
}
