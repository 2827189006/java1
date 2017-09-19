package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class BookDaoImpl{
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	// ����鼮
	public void addBook(Books book) {
		try {
			conn=JDBCUtils.getConnection();
			//׼��sql
			String sql="insert into books(bname,bprice,bnumber,bgifep,bgifen,sid,bstatus) " +
					"values(?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, book.getBname());
			ps.setDouble(2, book.getBprice());
			ps.setInt(3, book.getBnumber());
			ps.setInt(4, book.getBgifep());
			ps.setInt(5, book.getBgifen());
			ps.setInt(6, book.getSid());
			ps.setInt(7, book.getBstatus());
			//����
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(ps, conn);
		}
	}
	//��ѯ�鼮
	public List<Books> selAllBooks(int status) {
		List<Books> books=new ArrayList<Books>();
		try {
			conn=JDBCUtils.getConnection();
			//��ȡȫ���鼮
			String sql="select * from books where bstatus=?";
			ps=conn.prepareStatement(sql);
			//����ֵ
			ps.setInt(1, status);
			//�õ������
			rs=ps.executeQuery();
			//����ÿһ����¼�����뼯��
			while(rs.next()){
				//�Ѽ�¼����book������
				Books book=new Books();
				book.setBid(rs.getInt(1));
				book.setBname(rs.getString(2));
				book.setBprice(rs.getDouble(3));
				book.setBnumber(rs.getInt(4));
				book.setBgifep(rs.getInt(5));
				book.setBgifen(rs.getInt(6));
				book.setSid(rs.getInt(7));
				book.setBstatus(status);
				//�Ѷ�����뼯����
				books.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, ps, conn);
		}
		return books;
	}
	//����ID��ѯ�鼮
	public Books findBooks(int bid) {
		Books book=null;
		try {
			conn=JDBCUtils.getConnection();
			String sql="select * from books where bid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bid);
			rs=ps.executeQuery();
			if(rs.next()){
				book=new Books();
				book.setBid(bid);
				book.setBname(rs.getString(2));
				book.setBprice(rs.getDouble(3));
				book.setBnumber(rs.getInt(4));
				book.setBgifep(rs.getInt(5));
				book.setBgifen(rs.getInt(6));
				book.setSid(rs.getInt(7));
				book.setBstatus(rs.getInt(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, ps, conn);
		}
		return book;
	}
	//�޸��鼮
	public void updateBooks(Books book) {
		try {
			conn=JDBCUtils.getConnection();
			String sql="update books set bname=?,bprice=?,bnumber=? where bid=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, book.getBname());
			ps.setDouble(2, book.getBprice());
			ps.setInt(3, book.getBnumber());
			ps.setInt(4, book.getBid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, ps, conn);
		}
	}
	//ɾ���鼮
	public void delBooks(int bid) {
		try {
			conn=JDBCUtils.getConnection();
			String sql="delete from books where bid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,bid);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(ps, conn);
		}
	}

}
