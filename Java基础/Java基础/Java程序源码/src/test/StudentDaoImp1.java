package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public  class StudentDaoImp1 implements StudentDao {
private Connection conn;
private PreparedStatement ps;
private ResultSet rs;
public Student findStudent(String username, String password) {
	Student stu=null;
	try {
		conn=JDBCUtils.getConnection();
		String sql="select *from studemt where username=? and password=? and status in (1,2)";
		ps=conn.prepareStatement(sql);
		//���ã�ֵ
		ps.setString(1, username);
		ps.setString(2, password);
		//ִ�� SQL���
		rs=ps.executeQuery();
		//�ѽ������һ��Student����
		if(rs.next()){
			int sid=rs.getInt(1);
			String sname=rs.getString("sanem");
			int sage=rs.getInt("sage");
			String ssex=rs.getString(4);
			double balance=rs.getDouble(5);
			int sgife=rs.getInt(6);
			int status=rs.getInt("status");
			stu=new Student(sid, sname, ssex, sage, username, password, balance,sgife,status );
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
	 JDBCUtils.release(rs, ps, conn);
	}
	return stu;
}
//�û�ע����Ϣ���浽���ݿ���
public void addStudent(Student stu) {
try {
	conn=JDBCUtils.getConnection();
	//��Ӽ�¼�����ݿ���
	String sql="insert into student(sid, sname, ssex, sage, username, password, balance,sgife,status)"+"values(?,?,?,?,?,?,?,?)";
	ps=conn.prepareStatement(sql);
	//���ã�ֵ
	ps.setString(1,stu.getSname());
	ps.setInt(2, stu.getSage());
	ps.setString(3, stu.getSsex());
	ps.setDouble(4, stu.getBalance());
	ps.setInt(5, stu.getSgife());
	ps.setString(6, stu.getUsername());
	ps.setString(7, stu.getPassword());
	ps.setInt(8, stu.getStatus());
	//���浽���ݿ���
	ps.executeUpdate(sql);
} catch (Exception e) {
e.printStackTrace();
}finally{
	JDBCUtils.release(ps, conn);
}
}
//��������δ�������û�
public List<Student> selAllStu(int status){
	List<Student> students=new ArrayList<Student>();
	try {
		conn=JDBCUtils.getConnection();
		String sql="select *from student where status=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,status);
		rs=ps.executeQuery();
		while(rs.next()){
			Student stu=new Student(status, sql, sql, status, sql, sql, status, status, status);
			stu.setSid(rs.getInt(1));
			stu.setSname(rs.getString(2));
			stu.setBalance(rs.getDouble(3));
			stu.setSage(rs.getInt(4));
			stu.setSsex(rs.getNString(5));
			stu.setPassword(rs.getString(6));
			stu.setUsername(rs.getString(7));
			stu.setSgife(rs.getInt(8));
			stu.setStatus(rs.getInt(9));
			students.add(stu);
		}
	} catch (Exception e) {
     e.printStackTrace();
	}finally{
		JDBCUtils.release(rs, ps, conn);
	}
	return students;
}
//�����û�ID��ѯ����û�
public  Student findStudentID(int sid, int status){
	Student stu=null;
	try {
		conn=JDBCUtils.getConnection();
		String sql="select *from student where sid=? and status=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, sid);
		ps.setInt( 2,status);
		rs=ps.executeQuery();
		if(rs.next()){
			stu=new Student(status, sql, sql, status, sql, sql, status, status, status);
			stu.setSname(rs.getString(2));
			stu.setSage(rs.getInt(3));
			stu.setSsex(rs.getString(4));
			stu.setUsername(rs.getString(5));
			stu.setPassword(rs.getString(6));
			stu.setBalance(rs.getDouble(7));
			stu.setSgife(rs.getInt(8));
			stu.setStatus(status);
		}
	} catch (Exception e) {
	e.printStackTrace();
	}finally{
		JDBCUtils.release(rs, ps, conn);
	}
	return stu;
}
//�޸�ѧ����״̬
@Override
public void updateStudentStatus(int sid){
    try {
		conn=JDBCUtils.getConnection();
		String sql="update Student set status=? where sid=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, 1);
		ps.setInt( 1,sid);
		ps.executeQuery();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		JDBCUtils.release(ps, conn);
	}
}
//����һ�������޸����ѧ��
public void updateStudent(Student stu){
	try {
		conn=JDBCUtils.getConnection();
		String sql="update Student set sgae=?,ssex=?,balance=?sgife=?,where sid=?";
		ps=conn.prepareStatement(sql);
		ps.setString(2, stu.getSsex());
		ps.setDouble(3, stu.getBalance());
		ps.setInt(4, stu.getSgife());
		ps.setInt(5, stu.getSid());
		System.out.println(stu);
		ps.executeQuery();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		JDBCUtils.release(ps, conn);
	}
}
//ɾ����Ա
@Override
public void delStudent(int sid){
	try {
		conn=JDBCUtils.getConnection();
		String sql="delete from student where sid=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,sid);
		ps.executeQuery();
	} catch (Exception e) {
	e.printStackTrace();
	}finally{
		JDBCUtils.release(ps, conn);
}
}
@Override
public Student findstudent(String username, String password) {
	return null;
}
@Override
public List<Student> selAllstu(int students) {
	return null;
}
@Override
public Student findstudentID(int sid, int status) {
	return null;
}
@Override
public Student findStudentID(int sid) {
	// TODO Auto-generated method stub
	return null;
}
}
