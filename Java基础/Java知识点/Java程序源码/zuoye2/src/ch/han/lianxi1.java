package ch.han;

public class lianxi1 {

	public static void main(String[] args) {
	try{
		String name=args[0];
		System.out.println(name+",��ӭ��!");
	}catch(ArrayIndexOutOfBoundsException e){
	
		System.out.println("������������");
        System.out.println("index out of bound!");
}
}
}