package jp03.part01;

import java.io.*;

public class FileInputStreamTest{

	public static void main(String[] args){

		FileInputStream fls=null;
		int readCount=0;

		try{
			fls=new FileInputStream(args[0]);

			while(true){
				int i=fls.read();

				if(i==-1){
					break;
				}

				char c=(char)i;
				System.out.print(c);

				readCount++;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}finally{
			System.out.println("\n\n=======================");
			System.out.println("=====>>> readÈ½¼ö readCount:"+readCount);
			System.out.println("=========================");
			try{
				if(fls !=null) {
				fls.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
