package ��ϰ;

import java.util.ArrayList;

public class List {
	public static void names(){
      ArrayList<String>names=new ArrayList<String>();
    names.add("����");
    names.add("����");
    names.add("����");
    names.add("����");
    names.add("����");
  for(Object obj:names){
	System.out.println(obj.toString());  
  }

	}
	public void findElements(){
	  ArrayList<String>names=new ArrayList<String>();
	  System.out.println("is empty?"+names.isEmpty());
	  names.add("����");
	  names.add("����");
	  names.add("����");
	  names.add("����");
	  names.add("����");
	  System.out.println(names);
	  
	System.out.println("is empty?"+names.isEmpty());
	}
	public static void main(String[] args){
		ArrayList demo=new ArrayList();
	
	}
}
