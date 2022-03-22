package work;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception{
		// TODO Auto-generated constructor stub
	
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		List<String> l = new ArrayList<String>();
		
		String str = null;
		str = br.readLine();
		while(str != null) {
			l.add(str);
		}
		br.close();
		
		PrintWriter pw = new PrintWriter(new FileOutputStream(newf));
		for (int i = l.size()-1; i >= 0; i--) {
			pw.println(l.get(i));
		}
		pw.flush();
		pw.close();
			
		}
		

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileController c= new FileController();
		String oldf="files/oldf.txt";
		String newf="files/newf.txt";
		c.reverseLine(oldf, newf);
	}

}
