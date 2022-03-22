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
		System.out.println("�Է� :Korea");
		System.out.println("��� :"+p1.toEncoding("Korea"));
		System.out.println("�Է� :ȫ�浿");
		System.out.println("��� :"+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� :ȫ �� ��");
		System.out.println("��� :"+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� :Hong �� ��");
		System.out.println("��� :"+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� :0319");
		System.out.println("��� :"+p1.toEncoding("0319"));

	}

}
