package cn.test.atm.database;

import java.util.HashMap;
import java.util.Map;

import cn.test.atm.daomain.Account;

public class DataBase {
	//数据库DataBase对象
	private final static DataBase db=new DataBase();
	//存放用户信息的Map集合
	private static Map<String,Account> accountMap=new HashMap<String,Account>();
	
	private DataBase(){}
	
	//获取数据库对象的方法
	public static  DataBase getDataBase()
	{
		return db;
	}
	
	//获取用户信息的Map集合对象
	public Map<String,Account> getAccountMap()
	{
		return accountMap;
	}

}
