package homework.thirdWeekend;


public class CellPhone {
	private String phoneNumber;
	private int totalCallTime;		//��ȭ���ð�
	private int totalFee;			//�����
	private int feePerCallTime;	//�ܰ� - �ð��� �����
	
	public CellPhone() {
		super();
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	public void call(String phoneNumber, int totalCallTime) {
		System.out.println(phoneNumber+"��ȣ�� "+totalCallTime+"�� ��ȭ��");
		this.totalCallTime += totalCallTime;
	}
	public void calculateTotalFee() {
		this.totalFee = this.feePerCallTime*this.totalCallTime;
	}	
//////////////////////////////////////////////////////////////////////////
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
////////////////////////////////////////////////////////////////////////
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
////////////////////////////////////////////////////////////////////////
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
////////////////////////////////////////////////////////////////////////
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
}
