package com.han.demo;
/**
 * ģ�ⳬ�й���
 * @author Administrator
 *
 */
public class MarketTest {
public static void main(String[] args) {
	int penPice=20,bookPice=4,bookcasePice=10,penNo=20,bookNo=10,bookcaseNo=5;
	double discount=0.8;
	//����Ӧ�����
	double sun=(penPice*penNo+bookPice*bookNo+bookcasePice*bookcaseNo)*discount;
	double returnMonry=500-sun;
	/**��ӡСƱ**/
	System.out.println("*******���ѵ�******");
	System.out.println("Ʒ��\t"+"����\t"+"����\t"+"���\t");
	System.out.println("�ֱ�\t"+"��"+penPice+"\t"+penNo+"\t"+"��"+(penPice*penNo)+"\t");
	System.out.println("�ʼǱ�\t"+"��"+bookPice+"\t"+bookNo+"\t"+"��"+(bookPice*bookNo)+"\t");
	System.out.println("���\t"+"��"+bookcasePice+"\t"+bookcaseNo+"\t"+"��"+(bookcasePice*bookcaseNo)+"\t\n");
	System.out.println("�ۿۣ�"+"\t"+"����");
	System.out.println("����ܼ�\t"+"��"+sun);
	System.out.println("ʵ�ʽ��\t$500");
	System.out.println("��Ǯ��"+"��"+returnMonry);
	int score= (int) sun/100*3;
	System.out.println("���ν�������õĻ���Ϊ��"+score);
}
}
