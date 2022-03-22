package jp03;
import java.io.*;
/*
 * java.io package:���Ϸ� �ܺη� ������ �ްų�, ���� ��쿡 ���
 * 2.keyboard�� ���� data�� �о� ���̸�
 */
public class ReaderTest {
	//main mehtod
	public static void main(String[] args) {
		try {
			//inputStream :: ǥ�� �Է���ġ �߻�ȭ�� class
			InputStream inputStream = System.in;
			//inputStream�� Reader�� ����(byteó�� ==>����ó�� ����)
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("�Է��� ��ٸ��ϴ�.");
			//���� �о�帮�� ����loop����
			while(true) {
				//1.java.io�� ����(block)�� �� �ִ�.
				int i = reader.read();
				char c = (char)i;
				
				//2.java.io�� FIFO����
				System.out.println("�Է��Ͻ� ��:"+c);
				
				//==>char 'x'�� �ԷµǸ� while ����
				if(c=='x') {
					inputStream.close();
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
