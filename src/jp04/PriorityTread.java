package jp04;

public class PriorityTread extends Thread{
	//Field
	private String name;
	
	//Constructor
	public PriorityTread() {
		
	}
	public PriorityTread(String name) {
		this.name = name;
	}
	//method
	public void run() {
		for(int i=0; i<3; i++)
			System.out.println(name+"���");
	}
	public String getThreadName() {
		return name;
	}
	
	//main method
	public static void main(String[] args) {
		PriorityTread p1,p2,p3;
		
		p1 = new PriorityTread("1.�켱���� Max");
		p2 = new PriorityTread("2.�켱���� NORM");
		p3 = new PriorityTread("3.�켱���� MIN");
		
		p1.setPriority(Thread.MAX_PRIORITY);
//		p1.setPriority(8);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("::Main Thread 1EA");
		
		//��¼����� Ȯ������ 
		p3.start();
		p2.start();
		p1.start();
		System.out.println("::Main Thread 1EA + Thread 3EA");
		
		System.out.println("::"+p1.getThreadName()+"thread�� �켱����:"+p1.getPriority());
		System.out.println("::"+p3.getThreadName()+"thread�� �켱����:"+p2.getPriority());
		System.out.println("::"+p3.getThreadName()+"thread�� �켱����:"+p3.getPriority());
	}
}
