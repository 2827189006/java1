package cn.hp.zuoye;

public class Job1 {
	/**
	 * ģ���ӽ�������Ը�ӽ������6��ѡ�֣������ǣ���8����ί��ÿ��ѡ��
	��֣�ѡ�ֵ����÷���ȥ��һ����߷֡�ȥ��һ����ͷֵ�ƽ���֣�����֪6
	��ѡ�ֵ�ƽ���ɼ��ֱ���93.4,95.8,91.6,92.5,93.9,94.2��
	��д�������6λѡ
	�ֵ���߷֡���ͷ֣�Ȼ���6��ѡ�ֵ�ƽ���÷ִӸ߷ֵ��ͷֽ�������
	 * */
	public static void main(String[] args) {
		double[] arr={93.4,95.8,91.6,92.5,93.9,94.2};
		//����߷ֺ���ͷ�
		double max=arr[0];
		double min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("��߷�="+max);
		System.out.println("��ͷ�="+min);
		//ð������
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					double temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//�������
		/*for(double d : arr){
			System.out.println(d);
		}*/
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			
		}
	}
}
