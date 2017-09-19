package third;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30,80 , "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		//所有学生平均年龄、班级平均分
		int sum=0;
		for (int j=0;j<list.size();j++){
			Integer temp = (Integer)list.get(1);
			sum+=temp.intValue();
			System.out.println(list.get(j));
		}
		for(Object O:list){
			System.out.println(O);
		}
		/*System.out.println(list);*/
	}

}
