package cn.han;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class showtime {
public static void show_main(){
	int num;
	Scanner scan=new Scanner(System.in);
	do{
		System.out.println("------------------");
		System.out.println("1.登陆");
		System.out.println("2.注册");
		System.out.println("3.退出");
		System.out.println("------------------");
		System.out.println("请选择（1-3");
		num=scan.nextInt();
		switch(num){
		case 1:
			login1();
			break;
		case 2:
			register();
			break;
		case 3:
		System.out.println("Bye!");
			break;
			default:
		System.out.println("请输入1-3之间的数！");	
		}
	}while(num!=3);
}
@SuppressWarnings("unused")
public static void login1(){
String username,userpwd;
char ch;
int i;
Scanner scan=new Scanner(System.in);
do{
	System.out.println("------------------");
	System.out.println("1.进入登陆：");
	System.out.println("2.请输入用户名：");
	username=scan.next();
	System.out.println("\n请输入密码：");
	userpwd=scan.next();
	if(checkDB(username,userpwd)){
		System.out.println("登陆成功！");
	}else{
		System.out.println("用户或密码有误！");
	}
	System.out.println("是否继续（Y/N）：");
	ch=scan.next().charAt(0);
	System.out.println("------------------");
}while(ch!='n' && ch!='N');
}

@SuppressWarnings("finally")
public static boolean checkDB(String username, String userpwd) {
	boolean flag=false;
	Connection con=null;
	Statement s=null;
	ResultSet rs=null;
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	con=DriverManager.getConnection(
	"jdbc:sqlsever://localhost:1433;databasename=employ",
	"sa","4349");
	s=con.createStatement();
	rs=s.executeQuery("select uid from users where username="
	+username+"and userpwd="+userpwd+"");
	if(rs.next()){
		flag=true;
	}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null){
				rs.close();
			}
			if(s!=null){
				s.close();
			}
			if(con!=null){
				con.close();
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return flag;
	}
}
public static void register() {
}
}
