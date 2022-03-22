package homework.day2_28;

public class Prob {
	//method
	public String toEncoding(String str) {
		String arr = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if((c>='A' && c<='z')||(c>='0' && c<='9')||c==' ') {
				arr+=c;
			} else {
				String brr = c+"";
				byte[] temp = brr.getBytes();
				for(int j =0; j<temp.length; j++) {
					arr+=Integer.toHexString(temp[j]).toUpperCase().replaceAll("FFFFFF", "%");
				}
			}
		}
		return arr;
	}
	//main method
	public static void main(String[] args) {
		Prob p1 = new Prob();
		System.out.println("입력:Korea");
		System.out.println("출력: "+p1.toEncoding("Korea"));
		System.out.println("입력:홍길동");
		System.out.println("출력: "+p1.toEncoding("홍길동"));
		System.out.println("입력:홍 길 동");
		System.out.println("출력:"+p1.toEncoding("홍 길 동"));
		System.out.println("입력:Hong 길 동");
		System.out.println("출력 :"+p1.toEncoding("Hong 길 동"));
		System.out.println("입력: 0319");
		System.out.println("출력: "+p1.toEncoding("0319"));
	}// end of main
}//end of class


