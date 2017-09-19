package h_work;

import java.util.ArrayList;
import java.util.List;





public class BookStore {
		public static List <BookEntity> allBook(){
			List <BookEntity> bookList = new ArrayList <BookEntity> ();
			bookList.add(new BookEntity(10001,"代码大全",98,"迈克康奈尔","电子工业出版社"));
			bookList.add(new BookEntity(10002,"C#高级编程", 158, 
					"Christan Nagle Bill Evjen Jay Glynm", "清华大学出版社"));
			bookList.add(new BookEntity(10003, "Ajax基础教程", 35, "阿斯利森", "人民邮电出版社"));
			bookList.add(new BookEntity(10004, "JavaScrip高级程序设计", 59, "Nicholas C.Zakas", "人民邮电出版社"));
			bookList.add(new BookEntity(10004, "Java语言的科学与艺术", 59.8f, "Eric S.Roberts", "清华大学出版社"));
			
					
			return bookList;
			
		}
}
