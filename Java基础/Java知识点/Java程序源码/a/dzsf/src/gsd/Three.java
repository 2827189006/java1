package gsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Three {
	//3.�ڵ�ǰĿ¼����һ��source.txt�ļ�������a-z����ĸ��
	//����Щ��ĸ��ȡ�������ڿ���̨��ӡ��Ȼ���a-z��Сд��ĸ��Ϊ��д��ĸ�����
	
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
		//�ر���������Դ
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
