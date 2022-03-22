 package jp03.part01;

import java.io.*;

public class ReaderTest{

	public static void main(String[] args){

		InputStream inputStream=System.in;
		Reader reader=new InputStreamReader(System.in);

		System.out.println("입력을 기다립니다");
		try{
			while(true){

				int i=reader.read();
				char c=(char) i;

				System.out.println("입력하신값:"+c);

				if(c=='x'){
					inputStream.close();
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
