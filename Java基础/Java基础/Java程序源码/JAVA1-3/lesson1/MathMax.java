
public class MathMax {
int x=5;
int y=7;
void max(int max){
	if(x>y){
		System.out.println("max值是"x);
	}
	else if(x<y){
		System.out.println("max值是"y);
	}
public class MathMax1{
	int x=5;
	int y=7;
	int z=9;
void max(int max){
	if(x>y>z||x>z>y){
	System.out.println("max值是"x);
	}	
	else if(y>x>z||y>z>x){
		System.out.println("max值是"y);
	}
	else if(z>x>y||z>y>x){
		System.out.println("max值是"z);
	}
	public class MathMaxTest{
		public static void main(String[]args){
			MathMax M1=new MathMax();
			M1.max();
				MathMax M2=new MathMax("");
				M2.max();
		}
	}
