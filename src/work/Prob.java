package work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prob p2 = new Prob();
		Vector scores = p2.getScore("../data.txt");
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+":"
					+score.getKor()+""+score.getEng()+""
					+score.getMath()+""+score.getSum());
			
		}

	}
	public Vector getScore(String fileName)throws Exception{
		
		BufferedReader br= new BufferedReader(new FileReader(fileName));
		Vector vector = new Vector();
		
		int total =0;
		String arr ="";
		while((arr=br.readLine())!=null) {
			String[] brr = arr.split("/");
			for(int i=1; i<brr.length; i++) {
				int num=Integer.parseInt(brr[i]);
				total +=num;
			}

			Score score = new Score(brr[0],
			Integer.parseInt(brr[1]),
			Integer.parseInt(brr[2]),
			Integer.parseInt(brr[3]),
			total);
			total =0;

			vector.add(score);
		}

		br.close();
		return vector;
	}
	
	class Score{
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		
		public Score(String name, int kor, int eng, int math, int sum) {
			super();
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


}
