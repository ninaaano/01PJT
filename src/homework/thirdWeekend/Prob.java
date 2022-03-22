package homework.thirdWeekend;

public class Prob {
	private static String[] StringSplit(String str1, String str2) {
		//구현
		String[] brr = new String[5];
//		String a ="";
		for(int i=0;i<brr.length; i++) {
			brr[i] = "";
		}
		for(int i=0; i<str1.length(); i++) {
			
			for(int j=0; j<str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(0)) {
					
					brr[i] +=str1.charAt(j);
				}else {
					i++;
				}
			}
			return brr;	
		}
		return null;
		
//		String[] arr = new String[str1.length()];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Character.toString(str1.charAt(i));
//			System.out.print(arr[i]);
//		}
//		System.out.println();
		
		
//		String[] arr = str1.split(str2);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}		
		
	}

	// maind method
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = StringSplit(str, "#");
		System.out.println("===문자?�� 처리 결과===");

		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
