package test;


import java.util.List;
import java.util.Scanner;



/**
 * ���ֹ���
 * */
public class GifeService {
	private static final GifeDao GifeDao = null;
	private Scanner sc=new Scanner(System.in);
	private GifeDao gd= GifeDao;
	/**
	 * ��ʾ������ҳ��
	 * */
	public void showGifesMain(){
		System.out.println(" ����������ϵͳ >> ���ֹ���    ");
		System.out.println("**************************************");
		System.out.println("*           \t1.��ʾ������Ʒ                         *");
		System.out.println("*           \t2.�����Ʒ                                   *");
		System.out.println("*           \t3.�޸Ļ��ֹ���                         *");
		System.out.println("*           \tm.������������ϼ�               *");
		System.out.println("**************************************");
		System.out.print("��ѡ�����:");
		String input=sc.next();
		if("1".equals(input)){
			this.showAllGifeComm();
		}else if("2".equals(input)){
			this.addGifesComm();
		}else if("3".equals(input)){
			System.out.println("�޸Ļ��ֹ���");
		}else{
			AdminService as=new AdminService();
			as.adminManage();
		}
	}
	/**
	 * ��ʾ���л�����Ʒ
	 * */
	private void showAllGifeComm() {
		System.out.println(" ����������ϵͳ >> ���ֹ���  >>��ʾ������Ʒ ");
		System.out.println("��ƷID\t��Ʒ����\t\t��Ʒ�������");
		//������ʾ������Ʒ�ķ���
		List<Gifes> gifes=gd.selAllComm();
		for(Gifes g:gifes){
			System.out.println(g.getGid()+"\t"+g.getGid()+"\t\t"+g.getGid());
		}
		System.out.println("**********************************");
		System.out.println("*           \t1.�޸���Ʒ                         *");
		System.out.println("*           \t2.ɾ����Ʒ                         *");
		System.out.println("*           \tm.������������ϼ�     *");
		System.out.println("**********************************");
		System.out.print("��ѡ�����:");
		String input=sc.next();
		if("1".equals(input)){
			this.updateComm();
		}else if("2".equals(input)){
			this.delComm();
		}else{
			this.showGifesMain();
		}
	}
	/**
	 * ɾ����Ʒ
	 * */
	private void delComm() {
		System.out.println(" ����������ϵͳ >> ���ֹ���  >>��ʾ������Ʒ >>ɾ����Ʒ");
		System.out.println("������Ҫɾ����Ʒ��ID:");
		int gid=sc.nextInt();
		//�ж���ƷID�Ƿ����
		Gifes g=gd.findComm(gid);
		while(g==null){
			System.out.println("�������ID��������������!");
			gid=sc.nextInt();
			g=gd.findComm(gid);
		}
		gd.findComm(gid);
		System.out.println("*************************");
		System.out.println("*      \tɾ�����!      *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
	/**
	 * �޸���Ʒ
	 * */
	private void updateComm() {
		System.out.println(" ����������ϵͳ >> ���ֹ���  >>��ʾ������Ʒ >>�޸���Ʒ");
		System.out.println("������Ҫ�޸���Ʒ��ID:");
		int gid=sc.nextInt();
		//�ж���ƷID�Ƿ����
		Gifes g=gd.findComm(gid);
		while(g==null){
			System.out.println("�������ID��������������!");
			gid=sc.nextInt();
			g=gd.findComm(gid);
		}
		//��ʾ�����Ʒ����ϸ��Ϣ
		System.out.println("��ƷID:"+g.getGid()+"\t��Ʒ����:"+g.getGid());
		System.out.println("��Ʒ����:"+g.getGid());
		//�޸���Ʒ
		System.out.println("��������Ҫ�޸ĺ���Ʒ�Ļ���:");
		int gife=sc.nextInt();
		try {
			while(gife<0){
				System.out.println("������Ļ����������������룺");
				gife=sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("������Ļ����������������룺");
			this.updateComm();
		}
		//���޸ĺ�����Է��뵽������
		g.setGife(gife);
		//ִ���޸�
		gd.updateGife(g);
		System.out.println("*************************");
		System.out.println("*      \t�޸����!      *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
	/**
	 * ��ӻ�����Ʒ
	 * */
	private void addGifesComm() {
		System.out.println(" ����������ϵͳ >> ���ֹ���  >>��ӻ�����Ʒ  ");
		System.out.println("�����������Ʒ������:");
		System.out.println("�����������Ʒ�������:");
		Gifes g=new Gifes();
		gd.addGifesComm(g);
		System.out.println("*************************");
		System.out.println("*     \t�����Ʒ�ɹ�!    *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
}
