package jp03.part01;

import java.io.*;

public class WriterTest{

	public static void main(String[] args){

		InputStream inputStream=System.in;
		Reader reader=new InputStreamReader(System.in); //System.in의 dt: printstream=>inputstream 으로 형변환=>InputStreamReader(printstream)
		OutputStream outputStream=System.out; //이렇게쓰지마
		Writer writer=new OutputStreamWriter(outputStream);

		System.out.println("입력을 기다립니다");
		try{
			while(true){

				int i=reader.read();
				writer.write(i);
				writer.flush();

				if((char)i=='x'){
					break;
				}
			}
//			writer.flush(); //안써도 똑같이 작용함! 왜냐면~close때문~

			reader.close(); //close하는 순간 buffer실행
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
