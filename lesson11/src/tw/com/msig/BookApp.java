package tw.com.msig;

import java.util.Collection;
import java.util.Iterator;

public class BookApp {

	public static void main(String[] args) {
		BookService bookService
			= new BookService();
		
		
		
//		Iterator itr = books.iterator();
//		while(itr.hasNext()) {
//			Book book = (Book) itr.next();
//			System.out.println(book.getName());
//		}

		Collection<Book> books = bookService.getAll();
		for(Book book:books) {
			System.out.println(book.getName());
		}
		
	}

}
