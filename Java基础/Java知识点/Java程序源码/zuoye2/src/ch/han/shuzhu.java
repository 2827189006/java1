package ch.han;

public class shuzhu {

	public static void main(String[] args) {
		try{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
    System.out.println("befor excetion!");
      num1=1;
      System.out.println("after excetion!"); 
      num2=5;
      }catch(ArrayIndexOutOfBoundsException e){
    	  System.out.println(e);
    	  e.printStackTrace();
      }
     System.out.println("end!");
	}

}
