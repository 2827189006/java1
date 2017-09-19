package cn.han;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDemo {
	
	
	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet rs;
	public Connection getConn(){
		String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;database=shujuku";
		String dbUser="sa";
		String dbpassword="4349";
		try{
		Class.forName(dbDriver)	;
	    conn=DriverManager.getConnection(dbURL, dbUser, dbpassword);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return getConn();
		
	}
	public void showAllEmploy(){
		this .getConn();
		try{
		 pstm=conn.prepareStatement("select*from employ");
		 rs=pstm.executeQuery();	
		System.out.println("编号\t姓名\t工资");
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t");
			System.out.println(rs.getString(2)+"\t");
			System.out.println(rs.getString(3)+"\t");
			System.out.println(rs.getString(4));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null){rs.close();}
			if(pstm!=null){pstm.close();}
			if(conn!=null){conn.close();}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
	EmployDemo demo=new EmployDemo();
	demo.showAllEmploy();

	}


public boolean updateEmploy(String sql){
	boolean isSuc=false;
	this.getConn();
	try{
		pstm=conn.prepareStatement(sql);
		int effect=pstm.executeUpdate();
		if(effect>0){
			isSuc=true;
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null){rs.close();}
			if(pstm!=null){pstm.close();}
			if(conn!=null){conn.close();}
		}catch(SQLException e){
			e.printStackTrace();
	
		}
	}
	return isSuc;
	
}
public static void main1(String[] args) {
	EmployDemo demo=new EmployDemo();
	String sql="insert into employ values('王五','25',2500)";
	demo.updateEmploy(sql);
	sql="update employ set e_name='赵七'where e_id=5";
	demo.updateEmploy(sql);
	sql="delete from employ where e_age<22";
	demo.updateEmploy(sql);
	demo.showAllEmploy();
}
}