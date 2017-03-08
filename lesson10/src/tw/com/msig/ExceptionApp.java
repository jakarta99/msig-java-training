package tw.com.msig;

import java.io.IOException;

public class ExceptionApp {

	public static void main(String[] args) {
		
		HelloService helloService = new HelloService();
//		String greetings = "";
//		try {
//			
//			greetings = helloService.getHello("");
//			System.out.println(greetings);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("IO 異常");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("請輸入姓名");
//		}
		
		
		try {
			String greetings2 = helloService.getHello2("");
			System.out.println(greetings2);
		} catch (Exception e) {
			System.out.println("some error");
		}
	}

}
