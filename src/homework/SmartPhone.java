package homework;

public class SmartPhone extends CellPhone{
	boolean isMonthlyFixedRate;
	int monthlyFixedFee;
	

	public SmartPhone() {
		super();
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		this.setPhoneNumber(phoneNumber);
		this.setFeePerCallTime(feePerCallTime);
	}
	public void call(String phoneNumber, int totalCall) {
		System.out.println(phoneNumber+" ��ȣ��"+totalCall+" ��ȭ��");
		super.call(phoneNumber, totalCall);
	}
	public void calculateToatalFee() {
		
	}
	
}
