package test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * ��ȡ��Դ���ͷ���Դ
 *
 * */

@SuppressWarnings("unused")
public class JDBCUtils {

	private static Connection conn;
	/**
	 * ��ȡConnection
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
		 * �ͷ�����
		 * @param rs   �����
		 * @param statement  
		 * @param connection ����
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
