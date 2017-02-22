package tw.com.msig;

public class ValueApp {
	
	public static void main(String[] args) {
		
		int inputValue = 200;
		
		ValueService valueService = new ValueService();
		valueService.handle(inputValue);
		
		System.out.println(inputValue);
		
	}
}
