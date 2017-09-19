package test.string;

public class TestStringbuff {

	public static void main(String[] args) {
		//String是值不可改变的，StringBuffer是值可以改变的
		//StringBuilder比较StringBuffer做改变数据时候效率要高
		//StringBuilder是线程不安全的，如果作为单一线程的话，StringBuilder
		
		/*StringBuilder sd=new StringBuilder("zhangsan");
		System.out.println(sd);
		sd.append("123");
		System.out.println(sd);*/
		
		/*StringBuffer sb=new StringBuffer("zhangsan");
		char[] c={'a','b','c','d','e','f','1','2'};
		//0代表字符串哪个索引处开始,5代表到字符串索引处哪个位置前结束
		//c就是我们的char[],3代表从数组的哪个位置开始接受
		sb.getChars(2, 7, c, 3);
		System.out.println(c);
		*/
		
		/*//字符串的截断
		StringBuffer sb=new StringBuffer("abcd123456");
		System.out.println(sb);
		sb.setLength(7);
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("abc123");
		System.out.println(sb);
		sb=sb.reverse();
		System.out.println(sb);*/
		
		/*//如果不给缓冲区大小，默认是16
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		//确保容量缓冲区大小,如果超出给定的缓冲值他会把容量扩充到2倍+2
		sb.ensureCapacity(9);
		System.out.println(sb.capacity());*/
		
		//StringBuffer 值是可变的，如果要改变字符串的值，
		//用StringBuffer节省空间
		/*StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb);
		sb.append("123");
		System.out.println(sb);*/
		
		/*//String的值不可变
		String s=new String("abcasd");
		System.out.println(s);
		s=s.replace('a', 'A');
		s="123";
		System.out.println(s);*/
		
		/*s=new String("zxc");
		System.out.println(s);*/
	}

}
