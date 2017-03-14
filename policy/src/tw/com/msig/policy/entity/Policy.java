package tw.com.msig.policy.entity;

public class Policy {

	private Long id;
	
	private String policyNo;
	
	private String applicantName;
	
	private Integer premium;
	
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyNo=" + policyNo + ", applicantName=" + applicantName + ", premium="
				+ premium + "]";
	}
	
	public Integer getPremium() {
		return premium;
	}

	public void setPremium(Integer premium) {
		this.premium = premium;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	
}
