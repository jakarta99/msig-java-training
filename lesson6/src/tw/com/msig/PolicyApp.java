package tw.com.msig;

public class PolicyApp {
	
	public static void main(String[] args) {
		
		PolicyService policyService = new PolicyService();
		
		Policy queriedPolicy = policyService.getByPolicyNo("0017ABC0001");
		
		System.out.println(queriedPolicy);
		
	}
}
