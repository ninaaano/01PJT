package work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Prob02 {

	public static void main(String args[]) throws Exception {
		Prob02 e = new Prob02();
		Vector scores = e.getList();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
			
		}
		
	}

	public Vector getList() throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("./files/list.txt"));
		List<String> list = new ArrayList<String>();
//		Vector<String> vector =new Vector<String>(); 
		
		String pass = "수료";
		String none="미수료";
		String arr ="";
		
		while((arr=br.readLine())!=null) {
			String[] brr = arr.split("/");
			
			for(String str:brr) {
				list.add(str);
			}

			if("java".equalsIgnoreCase(brr[1]) && Integer.parseInt(brr[2])>=80) {
				list.add(pass+" \n");
			}else if("eql".equalsIgnoreCase(brr[1]) && Integer.parseInt(brr[2])>=90) {
				list.add(pass+" \n");
			}else {
				list.add(none+" \n");
			} 
	
		}
		return list;
	}

}
