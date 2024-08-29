package exam;

import java.io.FileWriter;
import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 파일쓰기
		 * FileWriter
		 */
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:/upload/test1.txt");
			while(true) {
				String line = sc.nextLine();
				// 입력받는 라인에 엔터키만 입력한 경우
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
