package tw.com.msig;

public class Policy {

	protected long id;
	protected String policyNo;
	
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyNo=" + policyNo + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
	
}
