package jp03;
import java.io.*;
/*
 * ==>FileCopy�ϴ� Application����
 * keyboard�� FileName�� �Է�
 */
public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args) throws Exception{
		//�ʿ䰴ü Stream/String �ν��Ͻ� deciaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName="";
		String copyFileName ="";
		
		int readCount=0; // read�� Count�ϱ����� ����
		System.out.print("copy�� file�̸��� �Է��ϼ���:");
		//copy�� File�̸� �Է�\
		InputStreamReader in = new InputStreamReader(System.in);
		fileName = new BufferedReader(in).readLine();
//		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		//=>�������� Data�� read�� �� �ִ� BufferedReader����
		FileReader fi = new FileReader(fileName);
		br = new BufferedReader(fi);
//		br = new BufferedReader(new FileReader(fileName));
		
		//=>�纻���� �̸� �����
		copyFileName = fileName+"_copy";
		//=>data�� write�� �� �ִ� BufferWrtier����
		bw = new BufferedWriter(new FileWriter(copyFileName));
		
		//read/writer�ϴ� while��
		String source = null;
		while((source=br.readLine())!=null) {
			bw.write(source+"\n");
			readCount++;
		}
		bw.flush();
		
		//Stream close()
		bw.close();
		bw.close();
		
		System.out.println("================");
		System.out.println("==========>readȽ�� readCount "+readCount);
		System.out.println("===============");
	}//end of main
}//end of class  