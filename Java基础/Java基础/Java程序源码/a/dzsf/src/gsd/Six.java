package gsd;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//6.	从键盘读入一行字符串，这行字符串内容类似如下:"2,10,1,22,19,30";
//提示：(1)输入升序排序,(2)降序排序，然后根据输入1或者2（注意不要有异常出现），
//在E:/a/result.txt文件夹下打印出结果。
public class Six {
public static void main(String[] args) {
	BufferedWriter bw=null;
	Scanner in=new Scanner(System.in);
	System.out.println("请输入您要输入的字符个数:");
	String count=in.next();
	StringBuffer sb=new StringBuffer();
	try {
		bw=new BufferedWriter(new FileWriter("G:/a/result.txt"));
		int cou = Integer.parseInt(count);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=cou;i++){
			System.out.println("请输入第"+i+"个:");
			arr.add(in.nextInt());
		}
		System.out.println("(1)输入升序排序,(2)降序排序");
		String s=in.next();
		if("1".equals(s)){
			fun1(arr);
		}else if("2".equals(s)){
			fun2(arr);
		}else{
			throw new NumberFormatException();
		}
		//遍历集合
		for(Integer i : arr){
			sb.append(i+" ");
		}
		//输出
		bw.write(sb.toString());
	}catch (NumberFormatException e) {
		System.out.println("您输入的有误，请重新运行!");
	}catch (InputMismatchException e) {
		System.out.println("您输入的有误，请重新运行!");
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		if(bw!=null){
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

private static List<Integer> fun2(ArrayList<Integer> arr) {
	//冒泡
	/*for(int i=0;i<arr.size()-1;i++){
		for(int j=0;j<arr.size()-i-1;j++){
			if(arr.get(j)<arr.get(j+1)){
				int temp=arr.get(j+1);
				arr.set(j+1, arr.get(j));
				arr.set(j, temp);
			}
		}
	}*/
	//重写比较
	Comparator<Integer> c=new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}
	};
	Collections.sort(arr, c);
	return arr;
}
//排序
public static List<Integer> fun1(List<Integer> arr){
	Collections.sort(arr);
	return arr;
}
}