package h_work;

import java.util.Iterator;
import java.util.List;

public class Test {
		public static void main(String[] args) {
			List <BookEntity> bookList = BookStore.allBook();
			Iterator<BookEntity> it = bookList.iterator();
			while(it.hasNext()){
				BookEntity book =it.next();
				System.out.println(book);
			}
		}
}
