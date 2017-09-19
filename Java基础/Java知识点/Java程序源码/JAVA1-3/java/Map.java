package Á·Ï°;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
	
	private static Collection c;
	private static String id;
	private static String name;
	private static String sex;
	private static String age;
	private static String love;{
	 Iterator it=c.iterator();
	 while(it.hasNext()){
		 System.out.println(it.next());
	 }
	}
	
	private static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap map=new HashMap();
    
	map.put(id, "1");
	map.put(name, "ÕÅÈý");
	map.put(sex, "ÄÐ");
	map.put(age, "25");
	map.put(love, "°®Ñ§Java");
	}
}
