package tw.com.msig;

public class PolicyService {

	public Policy getByPolicyNo(String policyNo) {
		// access database,
		Policy policy = new Policy(); 
		Policy policy2 = new Policy(1, "0017ABC0001");
		Policy policy3 = new Policy(1, "0017ABC0001", 10000);
		
		
		
		policy.setId(1);
		policy.setPolicyNo("0017ABC0001");
		policy.setSex(Sex.MAN);
		
		PolicyPremiumService policyPremiumService = new PolicyPremiumService();
		int premium = policyPremiumService.calculate(policy);
		policy.setPremium(premium);
		
		return policy;
	}
}
