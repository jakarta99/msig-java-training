package tw.com.msig.policy.service;

import java.util.Collection;

import tw.com.msig.policy.dao.PolicyDao;
import tw.com.msig.policy.dao.PolicyDatasourceDao;
import tw.com.msig.policy.entity.Policy;

public class PolicyService {
	
	public Policy getById(Long id) {
		PolicyDao policyDao = new PolicyDao();
		return policyDao.findById(id);
	}

	public Collection<Policy> getAll() {
		PolicyDatasourceDao policyDao = PolicyDatasourceDao.getInstance();
		Collection<Policy> policies = policyDao.findAll();
		
		return policies;
	}
	
	public void insert(Policy policy) {
		PolicyDao policyDao = new PolicyDao();
		policyDao.insert(policy);
	}
	
	public void update(Policy policy) {
		PolicyDao policyDao = new PolicyDao();
		policyDao.update(policy);
	}
	
	public void delete(Long id) {
		PolicyDao policyDao = new PolicyDao();
		policyDao.delete(id);
	}
}
