package cn.charpter8;

public class Demo {
	         //·½·¨
			public static void main(String[] args) {
//				int a=2,b=4,c=5;
//				Demo demo=new Demo();
//				demo.A(a, b, c);
//				c=fac(a);
//				System.out.println(c);
//				System.out.println(args.length);
//				System.out.println(args[0]);
				//System.out.println(A(a, b, c));
//			System.out.println(age(40));
				System.out.println(SUM(4));
			}
			
			
//	    	public  int A(int a,int b,int c){
//				int sum=a*a+b*b+c*c;
//				return sum;
//			}
//	    	
	    	static int fac(int n) {
	    		if (n==0||n==1) {
					return n;
				}else {
					return n*fac(n-1);
				}
	    		//return 0;
	    	}
//	    	
//	    	static int age(int n)
//	    	{
//	    		int c=0;
//	    		if(n==1)
//	    		{
//	    			c=10;
//	    		}
//	    		else if(n>1)
//	    		{
//	    			c= age(n-1)+2;
//	    		}
//	    		return c;
//	    	}
	    	
	    	static int SUM(int n)
	    	{
	    		int sum=0;
	    		if(n==1)
	    		{
	    			return sum=fac(n);
	    		}
	    		if(n>1)
	    		{
	    		sum=SUM(n-1)+fac(n);
	    		}
	    		return sum ;
	    	}
}