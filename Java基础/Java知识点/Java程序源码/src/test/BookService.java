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
	 * �����鼮������ҳ��
	 * */
	public void showBookMain(){
		System.out.println("       \t������ϵͳ >> �鼮����                  ");
		System.out.println("**************************************");
		System.out.println("*         \t1.��ʾ�����鼮                              *");
		System.out.println("*         \t2.����鼮                                        *");
		System.out.println("*         \t3.�鼮���                                        *");
		System.out.println("*         \tm.������������ϼ�                    *");
		System.out.println("**************************************");
		System.out.print("��ѡ�����:");
		String input=sc.next();
		//�ж���ѡ��Ĳ���
		if("1".equals(input)){
			this.showAllBooks();
		}else if("2".equals(input)){
			this.addBook();
		}else if("3".equals(input)){
			this.booksLook();//�鼮���
		}else{
			AdminService as=new AdminService();
			as.adminManage();
		}
	}
	/**
	 * �鼮���
	 * */
	private void booksLook() {
		System.out.println("������ϵͳ >> �鼮����  >> �鼮���");
		System.out.println("����Ҫͨ�����鼮ID\t");
		System.out.println("�����������");
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
	 * ��ʾ�����鼮
	 * */
	private void showAllBooks() {
		System.out.println("������ϵͳ >> �鼮����  >> ��ʾ�����鼮");
		System.out.println("�鼮ID\t�鼮����\t\t�鼮�ļ۸�\t�鼮����\t�ϴ���");
		List<Books> books=bd.selAllBooks(1);
		//��ȡ�ϴ�����Ϣ
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
		//��ȡ�����鼮���ж��޸Ļ�ɾ��
		System.out.println("*************************************");
		System.out.println("*            \t1.�޸��鼮                               *");
		System.out.println("*            \t2.ɾ���鼮                                *");
		System.out.println("*            \tm.�������������һ��       *");
		System.out.println("*************************************");
		System.out.print("��ѡ�����:");
		String input=sc.next();
		if("1".equals(input)){
			this.updateBooks();//�޸��鼮
		}else if("2".equals(input)){
			this.delBooks();
		}else{
			this.showBookMain();
		}
	}
	/**
	 * ɾ���鼮
	 * */
	private void delBooks() {
		System.out.println("������ϵͳ >> �鼮����  >> ��ʾ�����鼮 >>ɾ���鼮");
		System.out.println("�������޸��鼮��ID:");
		int bid=sc.nextInt();
		//�ж������ID�Ƿ����
		Books book=bd.findBooks(bid);
		while(book==null){
			System.out.println("�������ID�����ڣ�����������!");
			bid=sc.nextInt();
			book=bd.findBooks(bid);
		}
		//ɾ��
		bd.delBooks(bid);
		System.out.println("*************************");
		System.out.println("*      \tɾ���鼮!      *");
		System.out.println("*************************");
		this.showAllBooks();
	}
	/**
	 * �޸��鼮
	 * */
	private void updateBooks() {
		System.out.println("������ϵͳ >> �鼮����  >> ��ʾ�����鼮 >>�޸��鼮");
		System.out.println("�������޸��鼮��ID:");
		int bid=sc.nextInt();
		//�жϸ�����ID�Ƿ����
		Books book = bd.findBooks(bid);
		while(book==null){
			System.out.println("�������ID�����ڣ�����������!");
			bid=sc.nextInt();
			book = bd.findBooks(bid);
		}
		//�����޸�
		System.out.println("�������޸ĺ��鼮������:");
		String bname=sc.next();
		System.out.println("�������޸ĺ��鼮�ļ۸�:");
		double bprice=sc.nextDouble();
		System.out.println("�������޸ĺ��鼮����:");
		int bnumber=sc.nextInt();
		book.setBname(bname);
		book.setBprice(bprice);
		book.setBnumber(bnumber);
		bd.updateBooks(book);
		System.out.println("*************************");
		System.out.println("*      \t�޸����!      *");
		System.out.println("*************************");
		this.showAllBooks();
	}
	/**
	 * ����鼮
	 * */
	private void addBook() {
		System.out.println("������ϵͳ >> �鼮����  >> ����鼮");
		System.out.println("�������鼮����:");
		String bname=sc.next();
		System.out.println("�������鼮�۸�:");
		double bprice=sc.nextDouble();
		System.out.println("�������ϴ�����:");
		int bnumber=sc.nextInt();
		//�����ϴ���
		//�ҵ���˭�ڵ�½״̬
		Student stu=EnterMain.stu;
		//���������Է�װ��books������
		Books book=new Books(bname, bprice, bnumber, 10, 5, stu.getSid(), 1);
		//������鼮����������ݿ���
		bd.addBook(book);
		System.out.println("*************************");
		System.out.println("*      \t����ɹ�!       *");
		System.out.println("*************************");
		this.showAllBooks();
	}
}

