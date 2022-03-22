package jp03;
import java.io.*;
/*
 * ObjectOutputStream�� �̿� ȸ�������� ���� UserVO instance�� 
 * (��þ�� ���¸� ���´�/ ����������)persistence data(File)�� ����
 */
public class WriteObjectFile {
	//main method
	public static void main(String[] args) throws Exception{
		
		//1.instance�� File�� ������ SinkStream :: FileOutputStream����
		//2.instacne�� �����ϴ�FileStream : ObjectOutputStream����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oos.writeObject(new UserVO(1,"ȫ�浿"));//API Ȯ��
		oos.writeObject(new UserVO(2,"ȫ���"));//API check
		oos.flush();
		
		//Stream close()
		oos.close();
	}
}
