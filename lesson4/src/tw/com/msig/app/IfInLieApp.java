package tw.com.msig.app;

public class IfInLieApp {

	public static void main(String[] args) {
		int sex = 0;
		String gender = (sex == 0) ? "W":"M";
//		if(sex == 0) {
//			gender = "W";
//		} else {
//			gender = "M";
//		}
		System.out.println(gender);
	}
}
