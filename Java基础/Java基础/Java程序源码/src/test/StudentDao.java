package test;

import java.util.List;

public interface StudentDao {
/**
     * ͨ���û���������������ݿ��еĶ���
     * */
	Student findstudent(String username, String password);
	/**
	 * �û�ע����Ϣ���浽���ݿ���
	 * */
	void addStudent(Student stu);
	/**
	 * ��������δ�������û�
	 * */
	List<Student> selAllstu(int students);
	/**
	 *  �����û�ID��ѯ����û�
	 * */
	Student findstudentID(int sid,int status);
	/**
	 * �޸�ѧ����״̬
	 * */
	void updateStudentStatus(int sid);
	/**
	 * ����һ�������޸����ѧ��
	 * */
	void updateStudent(Student stu);
	/**
	 * //ɾ����Ա
	 * */
	void delStudent(int stu);
	Student findStudentID(int sid);
}
