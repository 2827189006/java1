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
//6.	�Ӽ��̶���һ���ַ����������ַ���������������:"2,10,1,22,19,30";
//��ʾ��(1)������������,(2)��������Ȼ���������1����2��ע�ⲻҪ���쳣���֣���
//��E:/a/result.txt�ļ����´�ӡ�������
public class Six {
public static void main(String[] args) {
	BufferedWriter bw=null;
	Scanner in=new Scanner(System.in);
	System.out.println("��������Ҫ������ַ�����:");
	String count=in.next();
	StringBuffer sb=new StringBuffer();
	try {
		bw=new BufferedWriter(new FileWriter("G:/a/result.txt"));
		int cou = Integer.parseInt(count);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=cou;i++){
			System.out.println("�������"+i+"��:");
			arr.add(in.nextInt());
		}
		System.out.println("(1)������������,(2)��������");
		String s=in.next();
		if("1".equals(s)){
			fun1(arr);
		}else if("2".equals(s)){
			fun2(arr);
		}else{
			throw new NumberFormatException();
		}
		//��������
		for(Integer i : arr){
			sb.append(i+" ");
		}
		//���
		bw.write(sb.toString());
	}catch (NumberFormatException e) {
		System.out.println("���������������������!");
	}catch (InputMismatchException e) {
		System.out.println("���������������������!");
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
	//ð��
	/*for(int i=0;i<arr.size()-1;i++){
		for(int j=0;j<arr.size()-i-1;j++){
			if(arr.get(j)<arr.get(j+1)){
				int temp=arr.get(j+1);
				arr.set(j+1, arr.get(j));
				arr.set(j, temp);
			}
		}
	}*/
	//��д�Ƚ�
	Comparator<Integer> c=new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}
	};
	Collections.sort(arr, c);
	return arr;
}
//����
public static List<Integer> fun1(List<Integer> arr){
	Collections.sort(arr);
	return arr;
}
}