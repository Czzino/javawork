package _01_File;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {

		// 1. 경로지정하지 않으면 프로젝트폴더에 생성됨
		// C:\tmp
		// C:/tmp
		try {
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 파일 생성됨

//			// 2. 경로를 지정하여 파일 만들기
//			File f2 = new File("C:/tmp\test2.txt");
//			f2.createNewFile();

			// 3. 폴더 만들고 그 폴더에 파일 생성
			File tempFoler = new File("C:/temp");
			tempFoler.mkdir();

			File f3 = new File("C:/temp/java.txt");
			f3.createNewFile();

			// 존재하는지 체크
			System.out.println("f1 존재하는가 ?" + f1.exists());
			System.out.println("f3 존재하는가 ?" + f3.exists());
			System.out.println("aaa.txt가 존재하는가 ? " + new File("aaa.txt").exists());

			// 파일인지 아닌지
			System.out.println("f1은 파일인가 ? " + f1.isFile());
			System.out.println("tempFoler는 파일인가? " + tempFoler.isFile());

			// 폴더인지 아닌지
			System.out.println("f1은 폴더인가 ? " + f1.isDirectory());
			System.out.println("tempFoler는 폴더인가? " + tempFoler.isDirectory());

			// 파일 폴더 생성
			File folder = new File("folder");
			folder.mkdir();

			File f4 = new File("folder/person.txt");
			f4.createNewFile();

			// 파일 이름 가져오기
			System.out.println("f4의 파일명 :" + f4.getName());
			System.out.println("f4의 절대경로 :" + f4.getAbsolutePath());
			System.out.println("f4의 파일용량 :" + f4.length());
			System.out.println("f4의 상위폴더 :" + f4.getParent());

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
