package cn.hp.zuoye;

public class Job3 {

	/**��д������1��+2��+....n������ʾ��Ҫ��ʹ�÷����������
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(sum(3));
	}
	
	//��׳˵ķ���
	public static int fun(int n){
		/*//����һ�����
		int result=1;
		if(n<=1){
			result=1;
		}else{
			result=n*fun(n-1);
		}
		return result;*/
		return n<=1?1:n*fun(n-1);
	}
	
	//�ۼ�
	public static int sum(int n){
		return n<=1?1:fun(n)+sum(n-1);
	}
}
