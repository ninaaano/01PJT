package homework.thirdWeekend;


public class Prob3 {
	public static void main(String[] args) {
		//전화번호 feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성 
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		//상대방저노하번호와 통화시간을 인자로 전달하는 call Mehtod호출
		cellPhone.call("017-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.calculateTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+" 의 통화시간은"+cellPhone.getTotalCallTime()+"이며 \n"
		+"단가"+cellPhone.getFeePerCallTime()+"총요금은 "+cellPhone.getTotalFee()+"원입니다.");
		System.out.println("=====================");
		
		//전화번호 feePerCalltime을 초기화하는 생성자 호출 인스턴스 생성
		SmartPhone smartPhone = new SmartPhone("000-000-000",200);
		smartPhone.call("017-017-017",10);
		smartPhone.calculateTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"의 통화시간은"+smartPhone.getTotalCallTime()+" 이며\n"
		+"단가"+smartPhone.getFeePerCallTime()+"총요금은"+smartPhone.getTotalFee()+"원 입니다.");
		
		System.out.println("=====================");
		
		//전화번호 feePerCalltime, 정액요금적용유무, 정액요금을 초기화하는 생성자 호출 인스턴스 생성
		SmartPhone smartPhone01 = new SmartPhone("111-111-111",0,true,3000);
		smartPhone01.call("017-017-017",10);
		smartPhone01.call("016-061-061",10);
		smartPhone01.calculateTotalFee();
		System.out.println(smartPhone01.getPhoneNumber()+"의 통화시간은"+smartPhone01.getTotalCallTime()+"이며 \n"
				+"단가"+smartPhone01.getFeePerCallTime()+" 총요금은"+smartPhone01.getTotalFee()+"원 입니다.");
		
	}
}//end of class

