package test;
import java.util.List;
import java.util.Scanner;

public class AdminService {
	private Scanner sc=new Scanner(System.in);
	private StudentDao sd=new StudentDaoImp1();
	/**
	 * �������Ա����
	 * */
	public void adminManage(){ 
		System.out.println("           \t����������ϵͳ                        ");
		System.out.println("*************************************");
		System.out.println("*          1.��Ա����                                          *");
		System.out.println("*          2.�鼮����                                          *");
		System.out.println("*          3.���ֹ���                                          *");
		System.out.println("*          4.ע          ��                                          *");
		System.out.println("*************************************");
		System.out.print("��ѡ�����:");
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
			System.out.println("�����������,����������!");
			this.adminManage();
		}
	}
	//�����Ա����
	private void leaguerManage() {
		System.out.println("       ����������ϵͳ >> ��Ա����               ");
		System.out.println("**************************************");
		System.out.println("*           1.��ʾ���л�Ա                                *");
		System.out.println("*           2.��ӻ�Ա��Ϣ                                *");
		System.out.println("*           3.����ע���Ա                                *");
		System.out.println("*           m.������������ϼ��˵�            *");
		System.out.println("**************************************");
		System.out.print("��ѡ�������");
		String input=sc.next();
		//�ж�ѡ��
		if("1".equals(input)){

			this.showAllLeaguer();
		}else if("2".equals(input)){
			this.addLeaguer();
		}else if("3".equals(input)){
			this.examine();//����
       }else{
	        this.adminManage();
       }
}
	/**
	 * ��ʾ���л�Ա
	 * */
	private void showAllLeaguer() {
		System.out.println("������ϵͳ >> ��Ա��Ϣ���� >> ��ʾ��Ա��Ϣ");
		System.out.println("��ԱID\t��Ա����\t��Ա����\t��Ա�Ա�\t��Ա���\t\t��Ա����\t" +
				"��Ա�û���\t");
		//��ѯ���л�Ա
		List<Student> students = sd.selAllstu(1);
		for(Student stu:students){
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSage()+"\t"
					+stu.getSsex()+"\t"+stu.getBalance()+"\t\t"+stu.getSgife()
					+"\t"+stu.getUsername());
		}
		//�޸�ɾ��
		System.out.println("*************************************");
		System.out.println("*         \t1.�޸Ļ�Ա��Ϣ                             *");
		System.out.println("*         \t2.ɾ����Ա��Ϣ                             *");
		System.out.println("*         \tm.�������뷵����һ��              *");
		System.out.println("*************************************");
		System.out.print("��ѡ�����:");
		String input=sc.next();
		//�ж�ѡ��
		if("1".equals(input.trim())){
			this.updateStudentInfo();
		}else if("2".equals(input.trim())){
			this.delStudentInfo();
		}else{
			this.leaguerManage();
		}
	}
	/**
	 * ɾ����Ա��Ϣ
	 * */
	private void delStudentInfo() {
		System.out.println("������ϵͳ >> ��Ա��Ϣ���� >> ��ʾ��Ա��Ϣ >>ɾ����Ա��Ϣ");
		System.out.println("�������Ա��ID:");
		int sid=sc.nextInt();
		Student stu = sd.findstudentID(sid, 1);
		//�ж�ID�Ƿ����
		while(stu==null){
			System.out.println("�������ID����,����������:");
			sid=sc.nextInt();
			stu = sd.findstudentID(sid, 1);
		}
		//�����������ѭ��������ɾ����Ա����
		sd.delStudent(sid);
		System.out.println("************************");
		System.out.println("*      \tɾ���ɹ�!     *");
		System.out.println("************************");
		this.showAllLeaguer();
	}
	/**
	 * ���û�Ա�޸ķ���
	 * */
	private void updateStudentInfo() {
		System.out.println("������Ҫ�޸Ļ�Ա��ID:");
		int sid=sc.nextInt();
		//��ѯ����ID�Ƿ����
		Student stu = sd.findstudentID(sid, 1);
		//�ж�ID�Ƿ����
		while(stu==null){
			System.out.println("�������ID����,����������:");
			sid=sc.nextInt();
			stu = sd.findstudentID(sid, 1);
		}
		System.out.println(stu);
		//��ʾ��Ա��Ϣ
		System.out.println("������ϵͳ >> ��Ա��Ϣ���� >> ��ʾ��Ա��Ϣ  >> �޸Ļ�Ա");
		System.out.println("��Ա��ID:"+stu.getSid()+"\t��Ա������:"+stu.getSname()+"\t��Ա������:"+stu.getSage()+
				"\t��Ա���Ա�:"+stu.getSsex());
		System.out.println("��Ա�����:"+stu.getBalance()+"\t��Ա�Ļ���:"+stu.getSgife()+"\t��Ա���û���:"+stu.getUsername());
		System.out.println();
		System.out.println("�������޸ĺ��Ա������:");
		stu.setSage(sc.nextInt());
		System.out.println("�������޸ĺ��Ա���Ա�:");
		stu.setSsex(sc.next());
		System.out.println("�������޸ĺ��Ա�����:");
		stu.setBalance(sc.nextDouble());
		System.out.println("�������޸ĺ��Ա�Ļ���:");
		stu.setSgife(sc.nextInt());
		sd.updateStudent(stu);
		System.out.println("***********************");
		System.out.println("*    \t�޸����!      *");
		System.out.println("***********************");
		this.showAllLeaguer();
	}
	/**
	 * ����Ա��ӻ�Ա
	 * */
	private void addLeaguer() {
		System.out.println("������ϵͳ >> ��Ա��Ϣ����  >> ��ӻ�Ա");
		//�Ҳ�������֤��,���������ʱ�䲹������
		//��ѯ����ID�Ƿ����
		int sid=sc.nextInt();
		try {
			Student stu = sd.findstudentID(sid, 0);
			//�ж�ID�Ƿ����
			while(stu!=null){
				System.out.println("�������ID�Ѵ���,����������:");
				sid=sc.nextInt();
				stu = sd.findstudentID(sid, 0);
			}
			System.out.println("�������Ա������:");
			String sname=sc.next();
			System.out.println("�������Ա����:");
			int sage=sc.nextInt();
			System.out.println("�������Ա���Ա�:");
			String ssex=sc.next();
			System.out.println("������ע�����:");
			double balance=sc.nextDouble();
			System.out.println("�������Ա��ʼ����:");
			int sgife=sc.nextInt();
			System.out.println("�������Ա�û���:");
			String username=sc.next();
			System.out.println("�������Ա�ĳ�ʼ����:");
			String password=sc.next();
			//���ǰ����Ϣ�����쳣
			if((sage>120 || sage<0)||!("��".equals(ssex) || "Ů".equals(ssex)) || sgife<0){
				throw new RuntimeException();
			}
			//�ѻ�Ա��Ϣ��װ����
			Student stu1=new Student(sname, sage, ssex, balance, username, password);
			stu1.setSgife(sgife);
			stu1.setStatus(1);
			//�Ѷ��󱣴浽���ݿ���
			sd.addStudent(stu1);
			System.out.println("**********************");
			System.out.println("\tע��ɹ�!");
			System.out.println("**********************");
			this.showAllLeaguer();
		} catch (Exception e) {
			System.out.println("���еط��������,����������");
			this.addLeaguer();
		}
	}
	//������Ա��Ϣ
	private void examine() {
		//��ʾ����δ�����Ļ�Ա
		System.out.println("������ϵͳ >> ��Ա���� >>����ע���Ա ");
		System.out.println("��Ա��ID\t��Ա������\t��Ա������\t��Ա���Ա�\t��Ա��ע����");
		List<Student> students = sd.selAllstu(0);
		//�������
		for(Student stu : students){
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSage()+"\t"
					+stu.getSsex()+"\t"+stu.getBalance());
		}
		System.out.println("*************************************");
		System.out.println("\t1.��������");
		System.out.println("\tm.�������뷵����һ�� ");
		System.out.println("*************************************");
		System.out.print("������ѡ��:");
		String input=sc.next();
		//�ж��Ƿ�����������Ƿ���
		if(input.trim().equals("1")){
			//����Ա�����Ա��ID��������Ա
			System.out.println("�������Ա��ID,������Ա:");
			int sid=sc.nextInt();
			//�鿴���ID�Ƿ����
			Student stu = sd.findstudentID(sid, 0);
			while(stu==null){
				System.out.println("�������ID����ȷ,����������:");
				sid=sc.nextInt();
				stu = sd.findstudentID(sid, 0);
			}
			//�����޸�״̬
			sd.updateStudentStatus(sid);
			System.out.println("*******************************");
			System.out.println("* \t������ϣ��尴��������أ�    *");
			System.out.println("*******************************");
			this.examine();
		}else{
			this.leaguerManage();
		}
	}
}