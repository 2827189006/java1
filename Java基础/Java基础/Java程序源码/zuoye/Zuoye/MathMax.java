package Zuoye;
/*1.	дһ��MathMax�࣬����������������ֵ������max(int x,int y)����������������������ֵ��Ȼ����дmax(int x,int y,int z)
����������������������ֵ��Ȼ���ٲ������н��в��ԡ�*/
public class MathMax {
	
	void max(int x, int y){
		int z;
		z=x>y?x:y;
		System.out.println("���ֵΪ:"+z);
	
}
	void max2(int x1,int y1, int z1){
		int da;
		da=(x1>y1?x1:y1)>z1?(x1>y1?x1:y1):z1;
		System.out.println("���ֵΪ:"+da);
	}
	
}
/*2.	��дһ��Exchange�࣬������һ��private int x���ԣ�
дsetX(int x)��������һ��ֵ��Ȼ����getX�����õ���
��ֵ�ķ��򣨱���setX(123),��getX�õ����ֵ�ǣ�321����*/
class Exchange{
	private int x;
	
	void setX(int x){
		this.x=x;
	}
	void getX(){
		int a,b,c,d,f,g,h,j,k;

	}
}
/*3.	��дJavaӦ�ó������ȶ���һ��Print�࣬����һ��
 * ����void output(int
x)�����x��ֵ��1���ڿ���̨��ӡ����д��Ӣ����ĸ��
���x��ֵ��2���ڿ���̨��ӡ��Сд��Ӣ����ĸ����Σ�
�ٶ���һ�����ࡪ��TestClass���������main�����д���Print��
�Ķ���ʹ�����������÷���output ()����ӡ����СдӢ����ĸ��*/
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
