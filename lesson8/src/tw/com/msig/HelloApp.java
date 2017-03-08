package tw.com.msig;

import org.apache.log4j.Logger;

public class HelloApp {
	//log4j.properties
	private static Logger log 
	= Logger.getLogger(HelloApp.class);

	public static void main(String[] args) {
		System.out.println("Hello");
		
		log.fatal("Hello Fatal");
		log.error("Hello ERROR");
		log.warn("Hello WARN");
		log.info("Hello INFO");
		log.debug("Hello DEBUG");
		
		
	}

}
