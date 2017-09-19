package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
	private Scanner sc=new Scanner(System.in);
	private BookDao bd=new BookDao();
	private StudentDao sd=new StudentDaoImp1();
	private Connection conn;
	private PreparedStatement ps;
	private int status;
	private ResultSet rs;
	/**
	 * 进入书籍管理主页面
	 * */
	public void showBookMain(){
		System.out.println("       \t书店管理系统 >> 书籍管理                  ");
		System.out.println("**************************************");
		System.out.println("*         \t1.显示所有书籍                              *");
		System.out.println("*         \t2.添加书籍                                        *");
		System.out.println("*         \t3.书籍审核                                        *");
		System.out.println("*         \tm.按任意键返回上级                    *");
		System.out.println("**************************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		//判断所选择的操作
		if("1".equals(input)){
			this.showAllBooks();
		}else if("2".equals(input)){
			this.addBook();
		}else if("3".equals(input)){
			this.booksLook();//书籍审核
		}else{
			AdminService as=new AdminService();
			as.adminManage();
		}
	}
	/**
	 * 书籍审核
	 * */
	private void booksLook() {
		System.out.println("书店管理系统 >> 书籍管理  >> 书籍审核");
		System.out.println("输入要通过的书籍ID\t");
		System.out.println("按任意键返回");
		sc.next();
		this.showBookMain();
	}
	public void allbooks(){
		List<Books> books=new ArrayList<Books>();
		try {
			conn=JDBCUtils.getConnection();
			String sql="select *from books where status=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,status);
			rs=ps.executeQuery();
			while(rs.next()){
				Books stu=new Books();
				stu.setBstatus(0);
				books.add(stu);
			}
		} catch (Exception e) {
	     e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, ps, conn);
		}
		return;
	}
	/**
	 * 显示所有书籍
	 * */
	private void showAllBooks() {
		System.out.println("书店管理系统 >> 书籍管理  >> 显示所有书籍");
		System.out.println("书籍ID\t书籍名称\t\t书籍的价格\t书籍数量\t上传者");
		List<Books> books=bd.selAllBooks(1);
		//获取上传者信息
		for(Books b : books){
			Student stu=sd.findStudentID(b.getSid());
//			System.out.println(Stub);
			if(b.getBname().length()<6){
				System.out.println(b.getBid()+"\t"+b.getBname()+"\t\t"+b.getBprice()
						+"\t"+b.getBnumber()+"\t"+stu.getSname());
			}else{
				System.out.println(b.getBid()+"\t"+b.getBname()+"\t"+b.getBprice()
						+"\t"+b.getBnumber()+"\t"+stu.getSname());
			}
		}
		//获取所有书籍，判断修改或删除
		System.out.println("*************************************");
		System.out.println("*            \t1.修改书籍                               *");
		System.out.println("*            \t2.删除书籍                                *");
		System.out.println("*            \tm.按任意键返回上一级       *");
		System.out.println("*************************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		if("1".equals(input)){
			this.updateBooks();//修改书籍
		}else if("2".equals(input)){
			this.delBooks();
		}else{
			this.showBookMain();
		}
	}
	/**
	 * 删除书籍
	 * */
	private void delBooks() {
		System.out.println("书店管理系统 >> 书籍管理  >> 显示所有书籍 >>删除书籍");
		System.out.println("请输入修改书籍的ID:");
		int bid=sc.nextInt();
		//判断输入的ID是否存在
		Books book=bd.findBooks(bid);
		while(book==null){
			System.out.println("您输入的ID不存在，请重新输入!");
			bid=sc.nextInt();
			book=bd.findBooks(bid);
		}
		//删除
		bd.delBooks(bid);
		System.out.println("*************************");
		System.out.println("*      \t删除书籍!      *");
		System.out.println("*************************");
		this.showAllBooks();
	}
	/**
	 * 修改书籍
	 * */
	private void updateBooks() {
		System.out.println("书店管理系统 >> 书籍管理  >> 显示所有书籍 >>修改书籍");
		System.out.println("请输入修改书籍的ID:");
		int bid=sc.nextInt();
		//判断给定的ID是否存在
		Books book = bd.findBooks(bid);
		while(book==null){
			System.out.println("您输入的ID不存在，请重新输入!");
			bid=sc.nextInt();
			book = bd.findBooks(bid);
		}
		//进行修改
		System.out.println("请输入修改后书籍的名称:");
		String bname=sc.next();
		System.out.println("请输入修改后书籍的价格:");
		double bprice=sc.nextDouble();
		System.out.println("请输入修改后书籍数量:");
		int bnumber=sc.nextInt();
		book.setBname(bname);
		book.setBprice(bprice);
		book.setBnumber(bnumber);
		bd.updateBooks(book);
		System.out.println("*************************");
		System.out.println("*      \t修改完毕!      *");
		System.out.println("*************************");
		this.showAllBooks();
	}
	/**
	 * 添加书籍
	 * */
	private void addBook() {
		System.out.println("书店管理系统 >> 书籍管理  >> 添加书籍");
		System.out.println("请输入书籍名称:");
		String bname=sc.next();
		System.out.println("请输入书籍价格:");
		double bprice=sc.nextDouble();
		System.out.println("请输入上传数量:");
		int bnumber=sc.nextInt();
		//设置上传者
		//找到是谁在登陆状态
		Student stu=EnterMain.stu;
		//把所有属性封装到books对象中
		Books book=new Books(bname, bprice, bnumber, 10, 5, stu.getSid(), 1);
		//把这个书籍对象放入数据库中
		bd.addBook(book);
		System.out.println("*************************");
		System.out.println("*      \t保存成功!       *");
		System.out.println("*************************");
		this.showAllBooks();
	}
}

