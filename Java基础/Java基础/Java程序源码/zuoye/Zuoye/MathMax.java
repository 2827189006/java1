package Zuoye;
/*1.	写一个MathMax类，用于求给定数的最大值。定义max(int x,int y)方法用于求出两个数的最大值，然后重写max(int x,int y,int z)
方法用于求出三个数的最大值。然后再测试类中进行测试。*/
public class MathMax {
	
	void max(int x, int y){
		int z;
		z=x>y?x:y;
		System.out.println("最大值为:"+z);
	
}
	void max2(int x1,int y1, int z1){
		int da;
		da=(x1>y1?x1:y1)>z1?(x1>y1?x1:y1):z1;
		System.out.println("最大值为:"+da);
	}
	
}
/*2.	编写一个Exchange类，类中有一个private int x属性，
写setX(int x)方法传进一个值，然后用getX方法得到这
个值的反序（比如setX(123),用getX得到这个值是：321）。*/
class Exchange{
	private int x;
	
	void setX(int x){
		this.x=x;
	}
	void getX(){
		int a,b,c,d,f,g,h,j,k;

	}
}
/*3.	编写Java应用程序。首先定义一个Print类，它有一个
 * 方法void output(int
x)，如果x的值是1，在控制台打印出大写的英文字母表；
如果x的值是2，在控制台打印出小写的英文字母表。其次，
再定义一个主类——TestClass，在主类的main方法中创建Print类
的对象，使用这个对象调用方法output ()来打印出大小写英文字母表。*/
class Print{
	
	void output(int x){
		
		if(x==1){
			System.out.println("A B C D E F G");
			System.out.println("H I J K L M N");
			System.out.println("O P Q   R S T");
			System.out.println("U V W   X Y Z");
		}else if(x==2){
			System.out.println("a b c d e f g");
			System.out.println("h i j k l m n");
			System.out.println("o p q   r s t");
			System.out.println("u v w   x y z");
			
		}
	}
}
