package jp03;

import java.io.*;

public class FileWriterTestFilter02{

	public static void main(String[] args) throws Exception{
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br=null;
		BufferedWriter bw=null;

		//keyboard로 입력받기 위한 Sink Stream Reader 및
		//1개의 line을 읽기편한readLine() method를 제공하느 BufferedReader생성
		//Reader r = new InputStreamReader(System.in);
		//br= new BufferedReader(r);
		br=new BufferedReader(new InputStreamReader(System.in));
		
		//File에 글을 쓰기위한 fileWrtier및 BufferWriter생성
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(fw);
		//bw=new BufferedWriter(new FileWriter("test.txt"));		//API check
//		bw = new BufferedWriter(new FileWriter("test.txt",true));	//api check
		bw = new BufferedWriter(new FileWriter("test.txt",false));	//false 사용 이유는 가독성을 위해서 사용한다.

		System.out.println("화일에 저장하실 글을 입력하세요 ");
		while(true){
			String str=br.readLine();
			if(str.equals("끝")){
				break;
			}
			bw.write(str,0,str.length());
//			bw.write(str);
			bw.newLine();
		}
			bw.flush();		//flush를 잊자 말것

			br.close();
			bw.close();
		}//end of main
	}//end of class