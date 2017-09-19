package cn.hp.zuoye;

public class Job1 {
	/**
	 * 模拟歌咏比赛，对歌咏比赛的6个选手，规则是：有8个评委给每个选手
	打分，选手的最后得分是去掉一个最高分、去掉一个最低分的平均分，现已知6
	个选手的平均成绩分别是93.4,95.8,91.6,92.5,93.9,94.2，
	编写程序求出6位选
	手的最高分、最低分，然后对6个选手的平均得分从高分到低分进行排序
	 * */
	public static void main(String[] args) {
		double[] arr={93.4,95.8,91.6,92.5,93.9,94.2};
		//求最高分和最低分
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
		System.out.println("最高分="+max);
		System.out.println("最低分="+min);
		//冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					double temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//遍历输出
		/*for(double d : arr){
			System.out.println(d);
		}*/
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			
		}
	}
}
