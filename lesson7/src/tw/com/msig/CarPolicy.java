package tw.com.msig;

public class CarPolicy extends Policy {

	private String carNo;
	private String engineNo;
	
	@Override
	public String toString() {
		return "CarPolicy [carNo=" + carNo + ", engineNo=" + engineNo + ", id=" + id + ", policyNo=" + policyNo + "]";
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	
	
}
