package tw.com.msig.app;

import java.time.LocalDate;

public class WhileApp {

	public static void main(String[] args) {
		
		int a = 0;
		
		while(a < 10) {
			if(a == 3) {
				a++;
				continue;
			}
			System.out.println(a);
			if(a == 5) {
				break;
			}
			a++;
		}
	}
	
	
}
