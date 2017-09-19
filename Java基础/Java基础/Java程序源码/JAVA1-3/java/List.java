package 练习;

import java.util.ArrayList;

public class List {
	public static void names(){
      ArrayList<String>names=new ArrayList<String>();
    names.add("张三");
    names.add("李四");
    names.add("王五");
    names.add("马六");
    names.add("赵七");
  for(Object obj:names){
	System.out.println(obj.toString());  
  }

	}
	public void findElements(){
	  ArrayList<String>names=new ArrayList<String>();
	  System.out.println("is empty?"+names.isEmpty());
	  names.add("张三");
	  names.add("李四");
	  names.add("王五");
	  names.add("马六");
	  names.add("赵七");
	  System.out.println(names);
	  
	System.out.println("is empty?"+names.isEmpty());
	}
	public static void main(String[] args){
		ArrayList demo=new ArrayList();
	
	}
}
