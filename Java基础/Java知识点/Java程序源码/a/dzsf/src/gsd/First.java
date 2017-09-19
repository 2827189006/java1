package gsd;

import java.io.File;

public class First {
		
public static void main(String[] args) {
	
	File f1=new File ("e:/a/b");
	File f2=new File ("e:/a/a.txt");
	try{
		f1.mkdirs();
		f1.createNewFile();
		f2.createNewFile();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}		
}
