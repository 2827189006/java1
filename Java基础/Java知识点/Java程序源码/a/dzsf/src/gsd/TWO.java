package gsd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//2.	从键盘任意输入内容，把这些内容读取到E盘a文件夹下的a.txt文件中
public class TWO {

	public static void main(String[] args) {
		File file=new File("e:/a/a.txt");
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			//开始输出
			//fos.write(97);//一个字节的输出
			String s="dsadasdlhaslkdksa";
			byte[] b=s.getBytes();
//			fos.write(b);//读出字节数组所有内容
			fos.write(b, 0, 17);
		} catch (IOException e) {
		}

	}

}
