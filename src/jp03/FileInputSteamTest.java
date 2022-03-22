package jp03;
import java.io.*;
public class FileInputSteamTest {
	//main method
	public static void main(String[] args) {
		//File을 읽어들이  Stream선언
		FileInputStream fis = null;
		//read() 수  count count위한 변수ㄴ
		int readCount=0;
		
		try {
			fis = new FileInputStream(args[0]);
			
			while(true) {
				int i= fis.read();
				
				if(i==-1) {// -1?�� ?��미는 ==API?��?��
					break;
				}
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n=================="	);
			System.out.println("=======>>read?��?�� readCount"+readCount);
			System.out.println("=========================");
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main
}//end of class
