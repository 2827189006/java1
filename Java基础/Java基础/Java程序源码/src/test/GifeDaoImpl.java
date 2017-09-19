package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class GifeDaoImpl implements GifeDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	//����һ��������Ʒ
	@Override
	public void addGifesComm(Gifes g) {
		try {
			conn=JDBCUtils.getConnection();
			String sql="insert into gifes(gname,gife) values(?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, g.getGname());
			ps.setInt(2, g.getGife());
			//ִ��
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(ps, conn);
		}
	}
	//��ʾ������Ʒ
	@Override
	public List<Gifes> selAllComm() {
		List<Gifes> gifes=new ArrayList<Gifes>();
		try {
			conn=JDBCUtils.getConnection();
			String sql="select * from gifes";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				int gid=rs.getInt(1);
				String gname=rs.getString(2);
				int gife=rs.getInt(3);
				Gifes g=new Gifes(gid, gname, gife);
				//���뼯��
				gifes.add(g);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,ps, conn);
		}
		return gifes;
	}
	//����ID������Ʒ
	@Override
	public Gifes findComm(int gid) {
		Gifes g=null;
		try {
			conn=JDBCUtils.getConnection();
			String sql="select * from gifes where gid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, gid);
			rs=ps.executeQuery();
			if(rs.next()){
				String gname=rs.getString(2);
				int gife=rs.getInt(3);
				g=new Gifes(gid, gname, gife);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,ps, conn);
		}
		return g;
	}
	//�޸Ļ���
	@Override
	public void updateGife(Gifes g) {
		try {
			conn=JDBCUtils.getConnection();
			String sql="update gifes set gife=? where gid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, g.getGife());
			ps.setInt(2, g.getGid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs,ps, conn);
		}
	}
	//ɾ����Ʒ
	@Override
	public void delComm(int gid) {
		try {
			conn=JDBCUtils.getConnection();
			String sql="delete from gifes where gid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, gid);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(ps, conn);
		}
	}

}
