package tw.com.msig;

import java.util.ArrayList;
import java.util.Collection;

public class BookService {

	public Collection<Book> getAll() {
		
		Collection<Book> books = new ArrayList<Book>();
		
		//books.add("book1");
		books.add(new Book("1","java",100));
		books.add(new Book("2","c#",100));
		
		return books;
		
	}
}
