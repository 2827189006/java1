
public class lianxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求出100以内所有质数,质数：只能被1和它本身整除的大于1的整数
				for(int i=1;i<=100;i++)
				{
					int count=0;//记录i能被j整除的次数
					for(int j=1;j<=i;j++)//用于循环操作找出i的因数
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println(i);
					}
				}
				
			}

		}
