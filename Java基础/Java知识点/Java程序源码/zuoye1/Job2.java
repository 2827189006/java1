package cn.hp.zuoye;

public class Job2 {

	/**
	 * ��дһ������public static void login
	 * (String username,Stringpwd)......,
	 * ʹ��main��������login��������ʵ�δ����Լ��������������ǡ�12
	3456����ʱ���������ӭXX��¼�ɹ���������������û������������	
	 * */
	public static void main(String[] args) {
		login("4", "123456");
	}
	
	public static void login(String username,String pwd){
		if("����".equals(username) && "123456".equals(pwd)){
			System.out.println("��ӭ"+username+"��¼�ɹ�!");
		}else{
			System.out.println("�û������������");
		}
	}
}
