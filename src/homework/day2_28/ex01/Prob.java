package homework.day2_28.ex01;

public class Prob {
   //method
   public String toEncoding(String str) {
      
      String arr = "";
      
      for(int i=0; i<str.length(); i++) {
    	  char brr = str.charAt(i);
         if((brr>='A' && brr<='z')||(brr >= '0' && brr<='9')|| brr ==' ') {
        	 arr += brr;
         }else{
        	String c =brr+""; 
         	byte[] temp = c.getBytes();
        	for(int j=0; j<=temp.length; j++) {
                arr += Integer.toHexString(temp[j]);   
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


/*
package ex04.homework2_28;

public class Prob {
   //method
   public String toEncoding(String str) {
      StringBuffer arr = new StringBuffer();
      
      byte[] temp = str.getBytes();
      String br = "";
      
      for(int i=0; i<str.length(); i++) {
         if(str.charAt(i) >'A' && str.charAt(i) <'Z') {
            return str;
         }
         else if(str.charAt(i)>'a' && str.charAt(i)<'z') {
            return str;
         }
         else if(str.charAt(i) > '0' && str.charAt(i)<'9') {
            return str;
         }   
      }
      
      
      for(int i=0; i<=str.length(); i++) {
         System.out.print(Integer.toHexString(temp[i]).replaceAll("ffffff","%"));
         
//         s += Integer.toHexString(temp[i].replaceAll("ffffff","%"));         
      }
      System.out.println();
      return null;
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

*/

