package test;

import java.util.List;

public interface StudentDao {
/**
     * 通过用户名和密码查找数据库中的对象
     * */
	Student findstudent(String username, String password);
	/**
	 * 用户注册信息保存到数据库中
	 * */
	void addStudent(Student stu);
	/**
	 * 查找所有未审批的用户
	 * */
	List<Student> selAllstu(int students);
	/**
	 *  根据用户ID查询这个用户
	 * */
	Student findstudentID(int sid,int status);
	/**
	 * 修改学生的状态
	 * */
	void updateStudentStatus(int sid);
	/**
	 * 传入一个对象修改这个学生
	 * */
	void updateStudent(Student stu);
	/**
	 * //删除会员
	 * */
	void delStudent(int stu);
	Student findStudentID(int sid);
}
