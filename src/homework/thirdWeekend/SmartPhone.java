package homework.thirdWeekend;


public class SmartPhone extends CellPhone{
	private boolean isMonthlyFixedRate; //������ ����� ����
	private int monthlyFixedFee;	//�����׿��
	
	public SmartPhone() {
		super();
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super.setPhoneNumber(phoneNumber);
		this.setFeePerCallTime(feePerCallTime);
	}
	public SmartPhone(String phoneNumber,int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super.setPhoneNumber(phoneNumber);
		super.setFeePerCallTime(feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	public void call(String phoneNumber, int totalCall) {
		//System.out.println(phoneNumber+" ��ȣ��"+totalCall+" ��ȭ��");
		super.call(phoneNumber, totalCall);
	}
	public void calculateTotalFee() {
		System.out.println("������"+this.monthlyFixedFee+" ���� ������Դϴ�.");
	}
	
	public void setisMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public boolean getisMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setmonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	public int getmonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public int getTotalFee() {
		return monthlyFixedFee;
	}
	
}//end of class
