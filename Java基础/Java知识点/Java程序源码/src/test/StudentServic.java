package test;

import java.util.Scanner;

public class StudentServic {
private Scanner sc=new Scanner(System.in);
private StudentDao sd=new StudentDaoImp1();
/**
 * �ж��û���½
 * �����½���뷵��Student����
 * @param sc 
 * */
	public Student login() {
		Student stu=null;
		int num=0;
		while(num<=3){
			System.out.println("�������û���:");
			String username=sc.next();
			System.out.println("����������:");
			String password=sc.next();
			//������ݿ���û��������¼,stuֵ��null
			stu=sd.findstudent(username, password);
			if(stu==null){
				num++;
				System.out.println("�û������������������"+(3-num)+"�λ����½��");
			}else{
				System.out.println("���������������ϵͳ�����˳� ��");
				break;
			}
		}
		return stu;
	}
	/**
	 * ������ͨ�û�ע��
	 * */
public void	register(){
	System.out.println("***********************************");
	System.out.println("*       ��ӭ����6-2�����ע��                 *");
	System.out.println("***********************************");
	System.out.println("*          ��������������                           *");
	String sname=sc.next();
	System.out.println("*          �������������䣺                     * ");
	int sage=0;
	while(true){
		try {
			String s=sc.next();
			sage=Integer.parseInt(s);
			if(sage<0||sage>120){
				throw new RuntimeException();
			}break;
		} catch (Exception e) {
			System.out.println("������������������������� ��");
		}
	}
	System.out.println("�����������Ա� ��");
	String ssex=sc.next();
	while(!("��".equals(ssex))||"Ů".equals(ssex)){
		System.out.println("��������Ա����� �����������룺");
		ssex=sc.next();
	}
  System.out.println("���������ĳ�ʼע���ʽ�");
  double balance=0;
  try {
	balance=sc.nextDouble();
	if(balance<0||balance>10000000){
		throw new RuntimeException();
	}
} catch (Exception e) {
System.out.println("������Ľ���������������룺");
}
//�û���������
  System.out.println("�����������û�����");
  String unsername=sc.next();
  System.out.println("�������������룺");
  String passerword=sc.next();
  Student stu=new Student(sname,sage,ssex,unsername,passerword,balance);
  stu.setStatus(0);
//���浽���ݿ�
  sd.addStudent(stu);
  System.out.println("**********************************/");
  System.out.println("*ע��ɹ������ǻᾡ��֪ͨ����Աͨ���� *");
  System.out.println("**********************************/");
}
}
