package test.random;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		
		/*char[] c={'a','b','中','小','1','2','6','q','w'};
		Random ran=new Random();
		for(int i=0;i<4;i++){
			System.out.print(c[ran.nextInt(c.length)]);
		}*/
		
		/*Random ran=new Random();
		double d=ran.nextDouble();
		int a=(int) (d*1000);
		System.out.println(a);*/
		
		
		/*Random ran=new Random();
		int a=ran.nextInt(100)+100;
		System.out.println(a);*/
		
		/*//设定随机数种子
		ran.setSeed(47);
		a=ran.nextInt(100);*/
		
		//只要给定种子，这个随机数就是一定的
		/*Random ran2=new Random(47);
		int b=ran2.nextInt(100);
		System.out.println(b);*/
	}
}
