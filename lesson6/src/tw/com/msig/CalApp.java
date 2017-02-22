package tw.com.msig;

public class CalApp {
	
	public static void main(String[] args) {
		
		CalService calService = new CalService();
		
		int sum = calService.add(2, 3);
		System.out.println("2+3="+sum);
		
		System.out.println(calService.sub(5, 2));
		System.out.println(calService.square(3));
	}
}
