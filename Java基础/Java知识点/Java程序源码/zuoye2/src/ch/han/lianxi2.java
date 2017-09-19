package ch.han;

import java.util.Scanner;

import sun.applet.Main;

import com.sun.jmx.snmp.UserAcl;

public class lianxi2 {
	/*用户名*/
	private String Name;
	/*密码*/
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
        System.out.println("请输入：");
        int usr=scanner.nextInt();
    try{ 
    String Name=param[0];
    String Psw=param[1];
    if(param.length<2);
    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("参数列表不正确");
    }catch(RuntimeException e){
    	System.out.println("密码长度不能少于6位");
    }
	return null;
    }
    }
}
