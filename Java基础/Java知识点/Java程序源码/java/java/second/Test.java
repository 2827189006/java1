package second;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add (new Worker("����", 18, 3000));
		list.add (new Worker("����", 25, 3500));
		list.add (new Worker("����", 22, 3200));
		list.add(1,new Worker("����", 24, 3300));
		list.remove(3);
		for(Object O:list){
			System.out.println(O);
		}
		/*System.out.print(list);*/
		
	}
	/*public void work(){  
		System.out.println(name + ��work��); 
		}*/

}
