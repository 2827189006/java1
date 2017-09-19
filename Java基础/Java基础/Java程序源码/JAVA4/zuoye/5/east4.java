package cn.diao;

public class east4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub4.
		//输出100以内的所有质数
        for(int i=2;i<=100;i++)
        {
        	int	count=0;
        	for(int j=1;j<=i;j++)
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
