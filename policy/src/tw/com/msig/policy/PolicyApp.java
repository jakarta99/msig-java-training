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
		
		// �إ� 1 ���s���O����
		Long nextId = maxId + 1;
		Policy policy = new Policy();
		policy.setId(nextId);		
		policy.setApplicantName("Test"+nextId);
		
		System.out.println("�s���O���ƬO"+policy);
		// �i��s�W���ʧ@
		policyService.insert(policy);	// insert
		
		System.out.println("List all (Finish Insert)----------------------------------");
		models = policyService.getAll();
		for(Policy model:models) {
			System.out.println(model);
		}
		
		// ���s���o�O��
		policy = policyService.getById(nextId);	// �����o�̷s�����
		
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
