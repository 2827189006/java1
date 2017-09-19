package gsd;
//5.	在当前文件下有一个IO.txt文件，用java代码复制到E:\a\IO.txt中。
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
  
//复制一个文件到当前的文件夹中  
public class Five   
{  
    public static void main(String[] args)   
    {  
        System.out.println("<><><><>______复制文件功能到当前的文件夹中______<><><><>");  
        // 关联一个需要复制的文件  
        FileReader  fr = null ;   
        //创建一个写入文件的对象  
        FileWriter  fw = null;  
        try {  
            //初使化对象  
            fr = new FileReader("G:/a/test.txt");  
            fw = new FileWriter("G:/a/test1.txt");  
            //调用数组的方法来读取文件数据并写入文件  
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