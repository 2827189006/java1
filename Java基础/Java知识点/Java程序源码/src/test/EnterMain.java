package test;

import java.util.Scanner;

public class EnterMain {

	private Scanner sc=new Scanner(System.in);
	private StudentServic ss=new StudentServic();
	static Student  stu;
/**
 * ������ҳ��
 * @param ss 
 * */
	public void showMain() {
		System.out.println("\t         ����������ϵͳ                   ");
		System.out.println("*********************************");
		System.out.println("           1.��½ϵͳ                                 ");
		System.out.println("           2.��Աע������                       ");
		System.out.println("           3.��        ��                                   ");
		System.out.println("*********************************");
		System.out.println("��ѡ�������");
		String input=sc.next();
		if("1".equals(input)){
			System.out.println("�����û���½��");
			stu=ss.login();
			if(stu==null){
				System.out.println("���ε�½ʧ�ܣ������˳�ϵͳ");
			}else{
				System.out.println("��½�ɹ�");
				switch ( stu.getStatus()){
				case 1:
					System.out.println("��Ա��½");
					break;
				case 2:
				System.out.println("����Ա��½��");
				break;
				}
			}
		}else if("2".equals(input)){
			System.out.println("��Աע��");
		}else if("3".equals(input)){
			System.out.println("��ӭ�´ι��٣�");
		}else{
			System.out.println("������Ĳ���ȷ�����������룡");
			this.showMain();
		}
	}
}
