package lesson;

public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("hello");
        s1.concat("svse");
        System.out.println("s1="+s1);
        String s2=new String("good morning!");
        s2.replace('o', 'u');
        System.out.println("s2="+s2);
	}

}
