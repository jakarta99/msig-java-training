package tw.com.msig.app;

public class YearApp {

	public static void main(String[] args) {
		
		int thisYear = 2017;
		
		if(thisYear % 4 == 0) {			
			if(thisYear % 100 != 0) {
				System.out.println("¶|¦~");
			} else {
				if(thisYear % 400 == 0) {
					System.out.println("¶|¦~");
				} else {
					System.out.println("Not ¶|¦~");
				}
			}
		} else {
			System.out.println("Not ¶|¦~");
		}
		
		
	}
	
}
