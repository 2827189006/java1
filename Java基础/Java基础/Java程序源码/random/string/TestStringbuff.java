package test.string;

public class TestStringbuff {

	public static void main(String[] args) {
		//String��ֵ���ɸı�ģ�StringBuffer��ֵ���Ըı��
		//StringBuilder�Ƚ�StringBuffer���ı�����ʱ��Ч��Ҫ��
		//StringBuilder���̲߳���ȫ�ģ������Ϊ��һ�̵߳Ļ���StringBuilder
		
		/*StringBuilder sd=new StringBuilder("zhangsan");
		System.out.println(sd);
		sd.append("123");
		System.out.println(sd);*/
		
		/*StringBuffer sb=new StringBuffer("zhangsan");
		char[] c={'a','b','c','d','e','f','1','2'};
		//0�����ַ����ĸ���������ʼ,5�����ַ����������ĸ�λ��ǰ����
		//c�������ǵ�char[],3�����������ĸ�λ�ÿ�ʼ����
		sb.getChars(2, 7, c, 3);
		System.out.println(c);
		*/
		
		/*//�ַ����Ľض�
		StringBuffer sb=new StringBuffer("abcd123456");
		System.out.println(sb);
		sb.setLength(7);
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("abc123");
		System.out.println(sb);
		sb=sb.reverse();
		System.out.println(sb);*/
		
		/*//���������������С��Ĭ����16
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		//ȷ��������������С,������������Ļ���ֵ������������䵽2��+2
		sb.ensureCapacity(9);
		System.out.println(sb.capacity());*/
		
		//StringBuffer ֵ�ǿɱ�ģ����Ҫ�ı��ַ�����ֵ��
		//��StringBuffer��ʡ�ռ�
		/*StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb);
		sb.append("123");
		System.out.println(sb);*/
		
		/*//String��ֵ���ɱ�
		String s=new String("abcasd");
		System.out.println(s);
		s=s.replace('a', 'A');
		s="123";
		System.out.println(s);*/
		
		/*s=new String("zxc");
		System.out.println(s);*/
	}

}
