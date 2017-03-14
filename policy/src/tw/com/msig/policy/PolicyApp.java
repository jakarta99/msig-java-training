package tw.com.msig.policy;

import java.util.Collection;

import tw.com.msig.policy.entity.Policy;
import tw.com.msig.policy.service.PolicyService;

public class PolicyApp {

	public static void main(String[] args) {
		System.out.println("Hello Policy");
		
		PolicyService policyService = new PolicyService();
		
		
		System.out.println("List all (initialize) ----------------------------------");
		
		Collection<Policy> models = policyService.getAll();
		Long maxId = 0L;
		for(Policy model:models) {
			System.out.println(model);
			maxId = model.getId();
		}
		
		// 建立 1 筆新的保單資料
		Long nextId = maxId + 1;
		Policy policy = new Policy();
		policy.setId(nextId);		
		policy.setApplicantName("Test"+nextId);
		
		System.out.println("新的保單資料是"+policy);
		// 進行新增的動作
		policyService.insert(policy);	// insert
		
		System.out.println("List all (Finish Insert)----------------------------------");
		models = policyService.getAll();
		for(Policy model:models) {
			System.out.println(model);
		}
		
		// 重新取得保單
		policy = policyService.getById(nextId);	// 先取得最新的資料
		
		String nextNo = "0000"+nextId;
		nextNo = nextNo.substring(nextNo.length()-5);
		policy.setPolicyNo("0000ABC"+nextNo);
		
		policyService.update(policy); // update
		
		System.out.println("List all (Finish Update) ----------------------------------");
		models = policyService.getAll();
		for(Policy model:models) {
			System.out.println(model);
		}
		
		
		policyService.delete(nextId); // delete
		
		System.out.println("List all (Finish Delete)----------------------------------");
		models = policyService.getAll();
		for(Policy model:models) {
			System.out.println(model);
		}
		
		
	}

}
