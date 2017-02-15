package tw.com.msig.app;

public class IfApp {

	public static void main(String[] args) {		
		double sexAgeRatio = 1;
		int age = 18;
		String gender = "W"; // "W"		
		if(age >= 30 && age < 60) {
			System.out.println("A is true");
			if(gender.equals("W")) {
				System.out.println("discount");
				sexAgeRatio = 0.9;
			}
		} else if (age <= 20) {
			sexAgeRatio = 1.1;
		} else {
			System.out.println("A is false");
			System.out.println("no discount");
		}		
		System.out.println(10000*sexAgeRatio);
	}
	
}
