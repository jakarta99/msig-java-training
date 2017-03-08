package tw.com.msig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionApp {

	public static void main(String[] args) {
		
		Collection fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add(300);
		
		Iterator itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
