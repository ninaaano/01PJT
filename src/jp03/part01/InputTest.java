 package jp03.part01;

import java.io.*;

public class InputTest{

	public static void main(String[] args) throws IOException{

		System.out.println(args[0]);
		
		InputStream inputStream=System.in;

		System.out.println("입력을 기다립니다");
	
			while(true){

				int i=inputStream.read();
				char c=(char) i;

				System.out.println("입력하신값:"+c);

				if(c=='x'){
					inputStream.close();
					break;
				}
			}
		
	}
}
