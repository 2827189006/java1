package test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 获取资源和释放资源
 *
 * */

@SuppressWarnings("unused")
public class JDBCUtils {

	private static Connection conn;
	/**
	 * 获取Connection
	 * @return 
	 * @throws Exception 
	 */
	public static Connection getConnection() throws Exception{
		Properties p=new Properties();
		InputStream is=JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		p.load(is);
		String jdbcDriver=p.getProperty("dbDriver");
		String jdbcURL=p.getProperty("dbURL");
		String usernam=p.getProperty("username");
		String password=p.getProperty("password");
		Class.forName(jdbcDriver);
		conn=DriverManager.getConnection(jdbcURL, usernam, password);
		return null;
	}
		/**
		 * 释放连接
		 * @param rs   结果集
		 * @param statement  
		 * @param connection 连接
		 */
		public static void release(ResultSet rs,Statement statement,Connection connection){
			if(rs!=null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(statement!=null){
				try{
			    	statement.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			}
			if(connection!=null){
				try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		public static void release(Statement statement,Connection connection){
			if(statement!=null){
				try{
			    	statement.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			}
			if(connection!=null){
				try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
		}
	}
}
