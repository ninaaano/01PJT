package homework.day3_03.number02;

class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int kor, int eng, int math, int sum) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}
