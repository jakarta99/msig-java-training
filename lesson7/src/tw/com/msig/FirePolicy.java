package tw.com.msig;

public class FirePolicy extends Policy {

	protected String targetArea;

	@Override
	public String toString() {
		return "FirePolicy [targetArea=" + targetArea + ", id=" + id + ", policyNo=" + policyNo + "]";
	}

	public String getTargetArea() {
		return targetArea;
	}

	public void setTargetArea(String targetArea) {
		this.targetArea = targetArea;
	}
	
}
