package ch.han;

import java.util.Scanner;

import sun.applet.Main;

import com.sun.jmx.snmp.UserAcl;

public class lianxi2 {
	/*�û���*/
	private String Name;
	/*����*/
	private String Psw;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPsw() {
		return Psw;
	}

	public void setPsw(String psw) {
		Psw = psw;
	}
    public String toString(){
	return"name:"+getName()+",password:"+getPsw();
}
    public class  UsrException extends Exception {
		public UsrException(){
			super();
		}
		public UsrException(String message ){
			super(message);
		}
	}
    public class UserBiz{
    public UserBean createUser(String[]param){
    	Scanner scanner=new Scanner(System.in);
        System.out.println("�����룺");
        int usr=scanner.nextInt();
    try{ 
    String Name=param[0];
    String Psw=param[1];
    if(param.length<2);
    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("�����б���ȷ");
    }catch(RuntimeException e){
    	System.out.println("���볤�Ȳ�������6λ");
    }
	return null;
    }
    }
}
