package tw.com.msig;

public class PolicyPremiumService {

	public int calculate(Policy policy) {
		
		if(policy.getSex().equals(Sex.MAN)) {
			return 12000;
		} else {
			return 10000;
		}
	}
	
}
