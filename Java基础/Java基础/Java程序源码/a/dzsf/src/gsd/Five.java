package gsd;
//5.	�ڵ�ǰ�ļ�����һ��IO.txt�ļ�����java���븴�Ƶ�E:\a\IO.txt�С�
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
  
//����һ���ļ�����ǰ���ļ�����  
public class Five   
{  
    public static void main(String[] args)   
    {  
        System.out.println("<><><><>______�����ļ����ܵ���ǰ���ļ�����______<><><><>");  
        // ����һ����Ҫ���Ƶ��ļ�  
        FileReader  fr = null ;   
        //����һ��д���ļ��Ķ���  
        FileWriter  fw = null;  
        try {  
            //��ʹ������  
            fr = new FileReader("G:/a/test.txt");  
            fw = new FileWriter("G:/a/test1.txt");  
            //��������ķ�������ȡ�ļ����ݲ�д���ļ�  
            char[] c = new char[1024];  
            int len = 0;  
            while((len=fr.read(c))!=-1)  
            {  
                fw.write(c,0,len);  
                fw.flush();  
            }  
        } catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        } catch (IOException e)   
        {  
            e.printStackTrace();  
        }finally  
        {  
            try   
            {  
                fr.close();  
            } catch (IOException e)   
            {  
                e.printStackTrace();  
            }  
            try   
            {  
                fw.close();  
            } catch (IOException e)   
            {  
                e.printStackTrace();  
            }  
        }  
  
    }  
  
}  