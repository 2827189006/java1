package test;
import java.sql.Connection;

public class TestBooks {

	//�Ƿ��ȡ������

	public void testConn(){
		Connection conn=null;
		try {
			conn=JDBCUtils.getConnection();
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(null, conn);
		}
	}
}
