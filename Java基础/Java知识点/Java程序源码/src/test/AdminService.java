package test;
import java.util.List;
import java.util.Scanner;

public class AdminService {
	private Scanner sc=new Scanner(System.in);
	private StudentDao sd=new StudentDaoImp1();
	/**
	 * 进入管理员界面
	 * */
	public void adminManage(){ 
		System.out.println("           \t书店管理销售系统                        ");
		System.out.println("*************************************");
		System.out.println("*          1.会员管理                                          *");
		System.out.println("*          2.书籍管理                                          *");
		System.out.println("*          3.积分管理                                          *");
		System.out.println("*          4.注          销                                          *");
		System.out.println("*************************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		if("1".equals(input)){
			this.leaguerManage();
		}else if("2".equals(input)){
			new BookService().showBookMain();
		}else if("3".equals(input)){
			new GifeService().showGifesMain();
		}else if("4".equals(input)){
			EnterMain em=new EnterMain();
			em.showMain();
		}else{
			System.out.println("您输入的有误,请重新输入!");
			this.adminManage();
		}
	}
	//进入会员管理
	private void leaguerManage() {
		System.out.println("       书店管理销售系统 >> 会员管理               ");
		System.out.println("**************************************");
		System.out.println("*           1.显示所有会员                                *");
		System.out.println("*           2.添加会员信息                                *");
		System.out.println("*           3.审批注册会员                                *");
		System.out.println("*           m.按任意键返回上级菜单            *");
		System.out.println("**************************************");
		System.out.print("请选择操作：");
		String input=sc.next();
		//判断选项
		if("1".equals(input)){

			this.showAllLeaguer();
		}else if("2".equals(input)){
			this.addLeaguer();
		}else if("3".equals(input)){
			this.examine();//审批
       }else{
	        this.adminManage();
       }
}
	/**
	 * 显示所有会员
	 * */
	private void showAllLeaguer() {
		System.out.println("书店管理系统 >> 会员信息管理 >> 显示会员信息");
		System.out.println("会员ID\t会员姓名\t会员年龄\t会员性别\t会员余额\t\t会员积分\t" +
				"会员用户名\t");
		//查询所有会员
		List<Student> students = sd.selAllstu(1);
		for(Student stu:students){
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSage()+"\t"
					+stu.getSsex()+"\t"+stu.getBalance()+"\t\t"+stu.getSgife()
					+"\t"+stu.getUsername());
		}
		//修改删除
		System.out.println("*************************************");
		System.out.println("*         \t1.修改会员信息                             *");
		System.out.println("*         \t2.删除会员信息                             *");
		System.out.println("*         \tm.任意输入返回上一级              *");
		System.out.println("*************************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		//判断选项
		if("1".equals(input.trim())){
			this.updateStudentInfo();
		}else if("2".equals(input.trim())){
			this.delStudentInfo();
		}else{
			this.leaguerManage();
		}
	}
	/**
	 * 删除会员信息
	 * */
	private void delStudentInfo() {
		System.out.println("书店管理系统 >> 会员信息管理 >> 显示会员信息 >>删除会员信息");
		System.out.println("请输入会员的ID:");
		int sid=sc.nextInt();
		Student stu = sd.findstudentID(sid, 1);
		//判断ID是否存在
		while(stu==null){
			System.out.println("您输入的ID有误,请重新输入:");
			sid=sc.nextInt();
			stu = sd.findstudentID(sid, 1);
		}
		//如果存在跳出循环并调用删除会员方法
		sd.delStudent(sid);
		System.out.println("************************");
		System.out.println("*      \t删除成功!     *");
		System.out.println("************************");
		this.showAllLeaguer();
	}
	/**
	 * 调用会员修改方法
	 * */
	private void updateStudentInfo() {
		System.out.println("请输入要修改会员的ID:");
		int sid=sc.nextInt();
		//查询输入ID是否存在
		Student stu = sd.findstudentID(sid, 1);
		//判断ID是否存在
		while(stu==null){
			System.out.println("您输入的ID有误,请重新输入:");
			sid=sc.nextInt();
			stu = sd.findstudentID(sid, 1);
		}
		System.out.println(stu);
		//显示会员信息
		System.out.println("书店管理系统 >> 会员信息管理 >> 显示会员信息  >> 修改会员");
		System.out.println("会员的ID:"+stu.getSid()+"\t会员的姓名:"+stu.getSname()+"\t会员的年龄:"+stu.getSage()+
				"\t会员的性别:"+stu.getSsex());
		System.out.println("会员的余额:"+stu.getBalance()+"\t会员的积分:"+stu.getSgife()+"\t会员的用户名:"+stu.getUsername());
		System.out.println();
		System.out.println("请输入修改后会员的年龄:");
		stu.setSage(sc.nextInt());
		System.out.println("请输入修改后会员的性别:");
		stu.setSsex(sc.next());
		System.out.println("请输入修改后会员的余额:");
		stu.setBalance(sc.nextDouble());
		System.out.println("请输入修改后会员的积分:");
		stu.setSgife(sc.nextInt());
		sd.updateStudent(stu);
		System.out.println("***********************");
		System.out.println("*    \t修改完毕!      *");
		System.out.println("***********************");
		this.showAllLeaguer();
	}
	/**
	 * 管理员添加会员
	 * */
	private void addLeaguer() {
		System.out.println("书店管理系统 >> 会员信息管理  >> 添加会员");
		//我不在做验证了,如果你们有时间补充完美
		//查询输入ID是否存在
		int sid=sc.nextInt();
		try {
			Student stu = sd.findstudentID(sid, 0);
			//判断ID是否存在
			while(stu!=null){
				System.out.println("您输入的ID已存在,请重新输入:");
				sid=sc.nextInt();
				stu = sd.findstudentID(sid, 0);
			}
			System.out.println("请输入会员的姓名:");
			String sname=sc.next();
			System.out.println("请输入会员年龄:");
			int sage=sc.nextInt();
			System.out.println("请输入会员的性别:");
			String ssex=sc.next();
			System.out.println("请输入注册余额:");
			double balance=sc.nextDouble();
			System.out.println("请输入会员初始积分:");
			int sgife=sc.nextInt();
			System.out.println("请输入会员用户名:");
			String username=sc.next();
			System.out.println("请输入会员的初始密码:");
			String password=sc.next();
			//如果前面信息出现异常
			if((sage>120 || sage<0)||!("男".equals(ssex) || "女".equals(ssex)) || sgife<0){
				throw new RuntimeException();
			}
			//把会员信息封装对象
			Student stu1=new Student(sname, sage, ssex, balance, username, password);
			stu1.setSgife(sgife);
			stu1.setStatus(1);
			//把对象保存到数据库中
			sd.addStudent(stu1);
			System.out.println("**********************");
			System.out.println("\t注册成功!");
			System.out.println("**********************");
			this.showAllLeaguer();
		} catch (Exception e) {
			System.out.println("您有地方输入错误,清重新输入");
			this.addLeaguer();
		}
	}
	//审批会员信息
	private void examine() {
		//显示所有未审批的会员
		System.out.println("书店管理系统 >> 会员管理 >>审批注册会员 ");
		System.out.println("会员的ID\t会员的姓名\t会员的年龄\t会员的性别\t会员的注册金额");
		List<Student> students = sd.selAllstu(0);
		//遍历输出
		for(Student stu : students){
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSage()+"\t"
					+stu.getSsex()+"\t"+stu.getBalance());
		}
		System.out.println("*************************************");
		System.out.println("\t1.进入审批");
		System.out.println("\tm.任意输入返回上一级 ");
		System.out.println("*************************************");
		System.out.print("请输入选项:");
		String input=sc.next();
		//判断是否进入审批还是返回
		if(input.trim().equals("1")){
			//管理员输入会员的ID，审批会员
			System.out.println("请输入会员的ID,审批会员:");
			int sid=sc.nextInt();
			//查看这个ID是否存在
			Student stu = sd.findstudentID(sid, 0);
			while(stu==null){
				System.out.println("您输入的ID不正确,请重新输入:");
				sid=sc.nextInt();
				stu = sd.findstudentID(sid, 0);
			}
			//调用修改状态
			sd.updateStudentStatus(sid);
			System.out.println("*******************************");
			System.out.println("* \t审批完毕，清按任意键返回！    *");
			System.out.println("*******************************");
			this.examine();
		}else{
			this.leaguerManage();
		}
	}
}