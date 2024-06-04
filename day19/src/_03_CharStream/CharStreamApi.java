package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	// 문자기반 스트림 2byte씩 전송
	/*
	 * 
	 * xxxReader : 입력용 스트림 xxxWriter : 출력용 스트림
	 */

	// 출력용 스트림
	void fileSave() {
		FileWriter fw = null;
		// 파일이 없으면 만들고 있으면 새로생성
		try {
			// 1.
			fw = new FileWriter("file_char.txt");

			// 2.
			fw.write('김');
			fw.write("와우 점심시간 끝났다");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");

			// char []
			char[] arr = { 't', 'j', 'o', 'e', 'u', 'n' };
			fw.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// 입력용 스트림
	void fileRead() {
		FileReader fr = null;

		try {
			fr = new FileReader("file_char.txt");

			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
