package work;

public class Parameter {

	public static String getParameter(String url,String paramName) {
		// TODO Auto-generated constructor stub
		String str = url.substring(url.indexOf(paramName));
		String paramName1 = str.substring(str.indexOf("=")+1, str.indexOf("&"));
		return paramName1;	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";

		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸�: " + prodName);

		String url2 = "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";

		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ�: " + userAddress);
	}
	

}
