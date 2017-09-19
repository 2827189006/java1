package lesson;

public class StringBufferDemo {
	public static void main(String[] args) {
	String question=new String("1+1=");
	int answer=3;
	boolean result=(1+1==3);
	StringBuffer sb=new StringBuffer();
	sb.append(question);
	sb.append(answer);
	sb.append(result);
	sb.insert(5,',' );
	System.out.println(sb);
	
	StringBuffer sb1=new StringBuffer(5);
	StringBuffer sb2=new StringBuffer(5);
	sb1.ensureCapacity(6);
	sb2.ensureCapacity(100);
	System.out.println("sb1.Capacity:"+sb1.capacity());
	System.out.println("sb2.Capacity:"+sb2.capacity());
}
}