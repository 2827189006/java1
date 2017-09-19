package cn.sever;

public class Test {
       public static void main(String[] args) {
    	   Vehicle v=new  Vehicle();
    	   v=new Car();
    	   v.wheels=4;
    	   System.out.println(4);
    	   v.weight=60f;
    	   System.out.println(60+"kg");
    	   v.loader();
    	   Car c=new Car();
    	   c=new Truck();
    	   c.wheels=8;
    	   System.out.println(8);
    	   c.weight=120f;
    	   System.out.println(120+"kg");
    	   c.payload();
	}
}
