package gsd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//2.	�Ӽ��������������ݣ�����Щ���ݶ�ȡ��E��a�ļ����µ�a.txt�ļ���
public class TWO {

	public static void main(String[] args) {
		File file=new File("e:/a/a.txt");
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			//��ʼ���
			//fos.write(97);//һ���ֽڵ����
			String s="dsadasdlhaslkdksa";
			byte[] b=s.getBytes();
//			fos.write(b);//�����ֽ�������������
			fos.write(b, 0, 17);
		} catch (IOException e) {
		}

	}

}
