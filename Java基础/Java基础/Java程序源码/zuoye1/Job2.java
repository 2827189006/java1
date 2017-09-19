package cn.hp.zuoye;

public class Job2 {

	/**
	 * 编写一个方法public static void login
	 * (String username,Stringpwd)......,
	 * 使用main方法调用login方法。当实参传入自己的姓名且密码是”12
	3456”的时候，输出”欢迎XX登录成功”，否则输出“用户名或密码错误”	
	 * */
	public static void main(String[] args) {
		login("4", "123456");
	}
	
	public static void login(String username,String pwd){
		if("老王".equals(username) && "123456".equals(pwd)){
			System.out.println("欢迎"+username+"登录成功!");
		}else{
			System.out.println("用户名或密码错误");
		}
	}
}
