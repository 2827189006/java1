package h_work;

import java.util.ArrayList;
import java.util.List;





public class BookStore {
		public static List <BookEntity> allBook(){
			List <BookEntity> bookList = new ArrayList <BookEntity> ();
			bookList.add(new BookEntity(10001,"�����ȫ",98,"���˿��ζ�","���ӹ�ҵ������"));
			bookList.add(new BookEntity(10002,"C#�߼����", 158, 
					"Christan Nagle Bill Evjen Jay Glynm", "�廪��ѧ������"));
			bookList.add(new BookEntity(10003, "Ajax�����̳�", 35, "��˹��ɭ", "�����ʵ������"));
			bookList.add(new BookEntity(10004, "JavaScrip�߼��������", 59, "Nicholas C.Zakas", "�����ʵ������"));
			bookList.add(new BookEntity(10004, "Java���ԵĿ�ѧ������", 59.8f, "Eric S.Roberts", "�廪��ѧ������"));
			
					
			return bookList;
			
		}
}
