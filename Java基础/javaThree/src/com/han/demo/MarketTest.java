package com.han.demo;
/**
 * 模拟超市购物
 * @author Administrator
 *
 */
public class MarketTest {
public static void main(String[] args) {
	int penPice=20,bookPice=4,bookcasePice=10,penNo=20,bookNo=10,bookcaseNo=5;
	double discount=0.8;
	//计算应交金额
	double sun=(penPice*penNo+bookPice*bookNo+bookcasePice*bookcaseNo)*discount;
	double returnMonry=500-sun;
	/**打印小票**/
	System.out.println("*******消费单******");
	System.out.println("品名\t"+"单价\t"+"数量\t"+"金额\t");
	System.out.println("钢笔\t"+"￥"+penPice+"\t"+penNo+"\t"+"￥"+(penPice*penNo)+"\t");
	System.out.println("笔记本\t"+"￥"+bookPice+"\t"+bookNo+"\t"+"￥"+(bookPice*bookNo)+"\t");
	System.out.println("书架\t"+"￥"+bookcasePice+"\t"+bookcaseNo+"\t"+"￥"+(bookcasePice*bookcaseNo)+"\t\n");
	System.out.println("折扣："+"\t"+"九折");
	System.out.println("金额总计\t"+"￥"+sun);
	System.out.println("实际金额\t$500");
	System.out.println("找钱："+"￥"+returnMonry);
	int score= (int) sun/100*3;
	System.out.println("本次交易所获得的积分为："+score);
}
}
