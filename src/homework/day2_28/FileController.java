package homework.day2_28;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileController {
	public void reverseLine(String oldf, String newf) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		
		List<String> list = new ArrayList<String>();
		String s =  br.readLine();
		s= br.readLine();	//while문 밖에 선언하면 돌아가지 않음 => 해결 ( while문안에 br.readLine을 선언해주어야 함 이유: readLine()은 NULL값을 포함하고 있기 때문에
		while(s!=null) {
			list.add(s);
			s= br.readLine();
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));
		for(int i=list.size()-1; i>=0; i--) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
		
//		BufferedReader br = new BufferedReader(new FileReader(oldf));
//		
//		List<String> list = new ArrayList<String>();
//		String a =null;
//		while((a=br.readLine())!=null){
//			list.add(a);
//		}
//		br.close();
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));
//		for(int i=list.size()-1; i>=0; i--) {
//			bw.write(list.get(i)+"");
//		}
//		bw.flush();
//		bw.close();
		
	}
	
	public static void main(String[] args) throws Exception  {
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf ="files/newf.txt";
		c.reverseLine(oldf,  newf);
	}
}
