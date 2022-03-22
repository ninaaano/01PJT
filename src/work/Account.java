package work;

public class Account {
	
	@Override
	public String toString() {
		return "계좌번호 :" + accountNo + ", 잔고:" + balance + "원" + (creditLine? "   [[ -"
				+ creditLineLimit + "원 마이너스 통장]]" : "");
	}

	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;
	
	public Account() {
		super();		
	}
	
	public Account(String accountNo,boolean creditLine,int creditLineLimit,int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;	
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws Exception {

		
//		if(!creditLine && (balance<money)) {
//			throw new Exception("잔고부족 출금불가 합니다.");
//		}
//		
//		if(creditLine && (balance+money>creditLineLimit)) {
//			throw new Exception("잔고부족 출금불가 합니다.");
//		}
//		
//		if(creditLine && (balance<money))
//			
			
		if(creditLine) {
			if(balance+creditLineLimit < money) {
				throw new Exception("잔고부족 출금불가 합니다.");
			} else {
				balance -= money;
			}
		}else {
			if(money > balance) {
				throw new Exception("잔고부족 출금불가 합니다.");
			}else {
				balance -= money;
			}
		}
		
	
		
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 111-111-111, 마이너스통장, 마이너스 통장한도, 잔고를 갖는 계좌 인스턴스 생성
		Account account01 = new Account("111-111-111",true,1000000,100000);
		try {
			System.out.println("0.최초 계좌 상태");
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n1."+account01.getAccountNo()+"계좌 200000 출금요청");
			account01.withdraw(200000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n2."+account01.getAccountNo()+"계좌 100000 입금요청");
			account01.deposit(100000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n3."+account01.getAccountNo()+"계좌 500000 출금요청");
			account01.withdraw(500000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n4."+account01.getAccountNo()+"계좌 600000 출금요청");
			account01.withdraw(600000);
			System.out.println("[계좌정보]"+account01);
			
		} catch(Exception e) {
			System.out.println(">>> 예외발생 : "+account01.getAccountNo()+":"+e.getMessage());
		}
		
		System.out.println("\n=========================\n");
		
		// 계좌 인스턴스 생성
		Account account02 = new Account();
		try {
			account02.setAccountNo("222-222-222");
			System.out.println("0.최초 계좌 상태");
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n1."+account02.getAccountNo()+"계좌 100000 입금요청");
			account02.deposit(100000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n2."+account02.getAccountNo()+"계좌 50000 출금요청");
			account02.withdraw(50000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n3."+account02.getAccountNo()+"계좌 60000 출금요청");
			account02.withdraw(60000);
			System.out.println("[계좌정보]"+account02);
		} catch(Exception e) {
			System.out.println(">>> 예외발생 : "+account02.getAccountNo()+":"+e.getMessage());
		}

	}

}
