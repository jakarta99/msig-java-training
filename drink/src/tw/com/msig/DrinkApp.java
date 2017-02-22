package tw.com.msig;

public class DrinkApp {

	public static void main(String[] args) {
		
		// input 1 cup coffee
		// <Interface> variable = new <Interface Implemenation Class>();
		DrinkService coffeeService = new CoffeeService();
		Drink drink = coffeeService.make();
		
		
	}
	
}
