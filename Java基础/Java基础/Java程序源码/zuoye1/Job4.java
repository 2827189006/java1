package cn.hp.zuoye;

public class Job4 {

	/**
	 * 在控制台中打印出这样一个图形
	 * */
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=0;j<5-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++){
				System.out.print((char)(65+k));
			}
			System.out.println();
		}
		
		/*char c='B';
		System.out.println((int)c);*/
	}
}
