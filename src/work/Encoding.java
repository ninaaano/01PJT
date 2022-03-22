package work;

public class Encoding {

	public String toEncoding(String str) {
		// TODO Auto-generated constructor stub
		
		byte[] temp = str.getBytes();
		String value = "";
		
		if (temp.length == str.length()) {
			value = str;
			
		} else if (temp.length == 2 * str.length()) { 
			String[] arr = new String[temp.length];
			for (int i = 0; i < temp.length; i++) {
				arr[i] = Integer.toHexString(temp[i]);
				value += "%"+arr[i].substring(6).toUpperCase();
			}
		}else {
			for (int j = 0; j < str.length(); j++) {
				if((int)str.charAt(j)<127) {
					value+=str.charAt(j);
				}
			}
		} return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encoding p1 = new Encoding();
		System.out.println("입력 :Korea");
		System.out.println("출력 :"+p1.toEncoding("Korea"));
		System.out.println("입력 :홍길동");
		System.out.println("출력 :"+p1.toEncoding("홍길동"));
		System.out.println("입력 :홍 길 동");
		System.out.println("출력 :"+p1.toEncoding("홍 길 동"));
		System.out.println("입력 :Hong 길 동");
		System.out.println("출력 :"+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 :0319");
		System.out.println("출력 :"+p1.toEncoding("0319"));

	}

}
