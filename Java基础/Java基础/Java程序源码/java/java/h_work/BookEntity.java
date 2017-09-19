package h_work;

public class BookEntity {
		
		
			private int book_id;
			private String book_name;
			private float book_price;
			private String book_author;
			private String publisher;
			
			public BookEntity() {
				super();
			}

			public BookEntity(int book_id, String book_name, float book_price,
					String book_author, String publisher) {
				super();
				this.book_id = book_id;
				this.book_name = book_name;
				this.book_price = book_price;
				this.book_author = book_author;
				this.publisher = publisher;
			}

			@Override
			public String toString() {
				return "书本编号：" + book_id + ",书名："
						+ book_name + ", 价格：" + book_price
						+ ", 作者：" + book_author + ", 出版社："
						+ publisher + "]";
			}

			public int getBook_id() {
				return book_id;
			}

			public void setBook_id(int book_id) {
				this.book_id = book_id;
			}

			public String getBook_name() {
				return book_name;
			}

			public void setBook_name(String book_name) {
				this.book_name = book_name;
			}

			public float getBook_price() {
				return book_price;
			}

			public void setBook_price(float book_price) {
				this.book_price = book_price;
			}

			public String getBook_author() {
				return book_author;
			}

			public void setBook_author(String book_author) {
				this.book_author = book_author;
			}

			public String getPublisher() {
				return publisher;
			}

			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}
			
			
		}
		

