package jp03.part04;

// package jp03.part06;

import java.io.*;

public class WriteObjectFile{

	public static void main(String[] args) throws Exception{

		ObjectOutputStream oos
			=new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1,"È«±æµ¿"));
		oos.writeObject(new UserVO(2,"È«±æ¼ø"));
		oos.flush();
		

		oos.close();

	}
}
