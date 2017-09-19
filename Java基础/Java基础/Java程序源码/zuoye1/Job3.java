package cn.hp.zuoye;

public class Job3 {

	/**编写程序求1！+2！+....n！并显示，要求使用方法调用完成
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(sum(3));
	}
	
	//求阶乘的方法
	public static int fun(int n){
		/*//设置一个结果
		int result=1;
		if(n<=1){
			result=1;
		}else{
			result=n*fun(n-1);
		}
		return result;*/
		return n<=1?1:n*fun(n-1);
	}
	
	//累加
	public static int sum(int n){
		return n<=1?1:fun(n)+sum(n-1);
	}
}
