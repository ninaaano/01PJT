package work;

public class Account {
	
	@Override
	public String toString() {
		return "���¹�ȣ :" + accountNo + ", �ܰ�:" + balance + "��" + (creditLine? "   [[ -"
				+ creditLineLimit + "�� ���̳ʽ� ����]]" : "");
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
//			throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
//		}
//		
//		if(creditLine && (balance+money>creditLineLimit)) {
//			throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
//		}
//		
//		if(creditLine && (balance<money))
//			
			
		if(creditLine) {
			if(balance+creditLineLimit < money) {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			} else {
				balance -= money;
			}
		}else {
			if(money > balance) {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}else {
				balance -= money;
			}
		}
		
	
		
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 111-111-111, ���̳ʽ�����, ���̳ʽ� �����ѵ�, �ܰ� ���� ���� �ν��Ͻ� ����
		Account account01 = new Account("111-111-111",true,1000000,100000);
		try {
			System.out.println("0.���� ���� ����");
			System.out.println("[��������]"+account01);
			
			System.out.println("\n1."+account01.getAccountNo()+"���� 200000 ��ݿ�û");
			account01.withdraw(200000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n2."+account01.getAccountNo()+"���� 100000 �Աݿ�û");
			account01.deposit(100000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n3."+account01.getAccountNo()+"���� 500000 ��ݿ�û");
			account01.withdraw(500000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n4."+account01.getAccountNo()+"���� 600000 ��ݿ�û");
			account01.withdraw(600000);
			System.out.println("[��������]"+account01);
			
		} catch(Exception e) {
			System.out.println(">>> ���ܹ߻� : "+account01.getAccountNo()+":"+e.getMessage());
		}
		
		System.out.println("\n=========================\n");
		
		// ���� �ν��Ͻ� ����
		Account account02 = new Account();
		try {
			account02.setAccountNo("222-222-222");
			System.out.println("0.���� ���� ����");
			System.out.println("[��������]"+account02);
			
			System.out.println("\n1."+account02.getAccountNo()+"���� 100000 �Աݿ�û");
			account02.deposit(100000);
			System.out.println("[��������]"+account02);
			
			System.out.println("\n2."+account02.getAccountNo()+"���� 50000 ��ݿ�û");
			account02.withdraw(50000);
			System.out.println("[��������]"+account02);
			
			System.out.println("\n3."+account02.getAccountNo()+"���� 60000 ��ݿ�û");
			account02.withdraw(60000);
			System.out.println("[��������]"+account02);
		} catch(Exception e) {
			System.out.println(">>> ���ܹ߻� : "+account02.getAccountNo()+":"+e.getMessage());
		}

	}

}
