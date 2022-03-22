package jp03;
import java.io.*;

/*
 * read() Method���� ȿ������ method�� �����ϴ� class���
 * 2.Sink stream:DAta�� ���� �ְ� �޴� �ܼ� ������� Stream
 *\
 */

public class BufferedReaderTest {
//main method
	public static void main(String[] args) throws Exception{
		//read�� count���� ����
		int readCount =0;
		
		//SinkStream ==> ���ܿ��� �ܼ� ����¸� ���
		FileReader fr = new FileReader(args[0]);
		//FileterStream ==>�߰����� ����� ����
		BufferedReader br = new BufferedReader(fr);
		
		//=>���� �� line�� �Ʒ��� ������
//		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine(); // APIȮ��
			if(oneLine ==null) {	//API check
				break;
			}
			System.out.println("�������: "+readCount+" "+oneLine);
		}
		//Stream close
		br.close();
		fr.close();
	}//end of main
}
