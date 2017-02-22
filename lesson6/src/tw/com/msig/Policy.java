package tw.com.msig;

// Value Object 
// Source -> Generate getters/setters
// Source -> Generate toString
public class Policy {

	private long id;
	private String policyNo;
	private int premium;
	private Sex sex;
	
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Policy() {
		
	}

	public Policy(long id, String policyNo) {
		this.id = id;
		this.policyNo = policyNo;
	}
	
	public Policy(long id, String policyNo, int premium) {
		this.id = id;
		this.policyNo = policyNo;
		this.premium = premium;
	}
	
	
	
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyNo=" + policyNo + ", premium=" + premium + ", sex=" + sex + "]";
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
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	
	
}
