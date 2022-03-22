package jp03;

import java.io.*;

public class FileWriterTestFilter02{

	public static void main(String[] args) throws Exception{
		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br=null;
		BufferedWriter bw=null;

		//keyboard�� �Է¹ޱ� ���� Sink Stream Reader ��
		//1���� line�� �б�����readLine() method�� �����ϴ� BufferedReader����
		//Reader r = new InputStreamReader(System.in);
		//br= new BufferedReader(r);
		br=new BufferedReader(new InputStreamReader(System.in));
		
		//File�� ���� �������� fileWrtier�� BufferWriter����
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(fw);
		//bw=new BufferedWriter(new FileWriter("test.txt"));		//API check
//		bw = new BufferedWriter(new FileWriter("test.txt",true));	//api check
		bw = new BufferedWriter(new FileWriter("test.txt",false));	//false ��� ������ �������� ���ؼ� ����Ѵ�.

		System.out.println("ȭ�Ͽ� �����Ͻ� ���� �Է��ϼ��� ");
		while(true){
			String str=br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str,0,str.length());
//			bw.write(str);
			bw.newLine();
		}
			bw.flush();		//flush�� ���� ����

			br.close();
			bw.close();
		}//end of main
	}//end of class