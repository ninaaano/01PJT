package homework.day2_28.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception {
		// TODO Auto-generated constructor stub
		BufferedReader br = new BufferedReader(new FileReader(oldf));

		String copyFile = "";
		List<String> a = new ArrayList<String>();
		// a값안에 br을 넣을건데 br은 readLine으로 읽을 거다. 한번에 안읽어지니까 while이나 for문 돌리기
		// while문안에서 br값을 arraylist 값안에 넣는 작업 진행

		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));

		String str2 = br.readLine();
		while (str2 != null) {
//			bw.write(str2);
			a.add(str2);
//         bw.add(str2);
			str2 = br.readLine();
		}
		System.out.println(a);
		br.close();

		for (int i = 0; i < br.readLine().length(); i++) {
			System.out.println(a.get(i));
		}

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
	}

}