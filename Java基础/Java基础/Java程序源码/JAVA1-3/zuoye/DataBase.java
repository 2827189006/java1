package cn.test.atm.database;

import java.util.HashMap;
import java.util.Map;

import cn.test.atm.daomain.Account;

public class DataBase {
	//���ݿ�DataBase����
	private final static DataBase db=new DataBase();
	//����û���Ϣ��Map����
	private static Map<String,Account> accountMap=new HashMap<String,Account>();
	
	private DataBase(){}
	
	//��ȡ���ݿ����ķ���
	public static  DataBase getDataBase()
	{
		return db;
	}
	
	//��ȡ�û���Ϣ��Map���϶���
	public Map<String,Account> getAccountMap()
	{
		return accountMap;
	}

}
