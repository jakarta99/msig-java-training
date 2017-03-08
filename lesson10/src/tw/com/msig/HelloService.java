package tw.com.msig;

public class HelloService {
	
	public String getHello(String name) throws Exception {
		
		if(name == null || name == "") {
			throw new Exception("name can't be empty");
		}
		
		
		return "Hello "+name;
	}
	
	public String getHello2(String name) {
		if(name == null || name == "") {
			throw new RuntimeException("name can't be empty");
		}
		
		return "Hello "+name;
	}
}
