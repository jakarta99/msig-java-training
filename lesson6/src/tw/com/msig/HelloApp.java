package tw.com.msig;

public class HelloApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		// TYPE variable = new TYPE();
		HelloService helloService = new HelloService();
		String returnValue = helloService.getHello();
		
		System.out.println(returnValue);
	}
}
