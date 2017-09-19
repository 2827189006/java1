package gsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Three {
	//3.在当前目录下有一个source.txt文件，放有a-z的字母，
	//把这些字母读取出来并在控制台打印，然后把a-z的小写字母改为大写字母输出。
	
	public static void main(String[] args) {
		File file=new File("E:/a/source.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
			
			byte[] buffer=new byte[1024];
					int len=0;
			while((len=fis.read(buffer))!=-1){
				for(int i=0;i<len;i++){
					System.out.print((char)buffer[i]);
				}
				System.out.println();
				for(int i=0;i<len;i++){
					System.out.print(Character.toUpperCase((char)buffer[i]));
				}
			}
		} catch (IOException e) {
			 
		e.printStackTrace();
		}	finally{
		//关闭输入流资源
		if(fis!=null){
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
}
