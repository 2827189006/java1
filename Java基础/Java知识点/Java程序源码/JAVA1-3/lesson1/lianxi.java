
public class lianxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���100������������,������ֻ�ܱ�1�������������Ĵ���1������
				for(int i=1;i<=100;i++)
				{
					int count=0;//��¼i�ܱ�j�����Ĵ���
					for(int j=1;j<=i;j++)//����ѭ�������ҳ�i������
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
