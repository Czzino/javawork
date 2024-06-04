package _04_BufferStream;

import java.io.*;

public class BufferStreamApi {
	/*
	 * 보조 스트림 : 외부매체와 직접 연결 하지 않음. 단독사용 불가 반드시 기반스트림과 함께 사용
	 */

//	void fileSave() {
//		// 기반 스트림 : FileWriter를 사용
//		// 보조 스트림 : BufferWritter로 출력 속됴 향상
//
//		// 순서
//		// 1. 기반스트림 먼저 생성
//		// 2. 보조스트림 생성(기반스트림 객체를 전달하면서 생성)
//		// 3. 파일 쓰고
//		// 4. 보조스트림과 기반스트림 닫기
//
////		FileWriter fw = null;
//		BufferedWriter bw = null;
//		try {
//			// 1.
////			fw = new FileWriter("file_buffer.txt");
//
////			// 2. 
////			BufferedWriter bw = new BufferedWriter(fw);
//
//			// 버퍼의 사이즈가 있고 다차면 다음거를실행 안차면 기다림
//			bw = new BufferedWriter(new FileWriter("file_buffer.txt"));
//			bw.write("안녕하세요?\n");
//			bw.write("맛점 하셨나요?");
//
//			bw.newLine(); // 줄바꿈 메소드
//			bw.write("나는 자바가 좋아요");
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	// try - catch-resource 구문으로 자원반납을 하지 않는다

	// try(try블럭내에서 사용할 스트림 객체 생성 구문) { // 알아서 try 구문이 다 끝나면 해당 스트림 반납까지 해줌

//	} catch(예외 클래스 e) {
//		
//	}

	void fileSave() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("file_buffer.txt"));) {
			bw.write("안녕하세요?\n");
			bw.write("맛점 하셨나요?");

			bw.newLine(); // 줄바꿈 메소드
			bw.write("나는 자바가 좋아요\n");
			bw.write("거짓말");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	BufferedReader bReader = null;

	void fileRead() {
		// 강사님 코드

		try (BufferedReader br = new BufferedReader(new FileReader("file_buffer.txt"))) {
			String value = null;
			while ((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 내코드
//		try {
//			String s;
//			File file = new File("file_buffer.txt");
//			bReader = new BufferedReader(new FileReader(file));
//
//			while ((s = bReader.readLine()) != null) {
//				System.out.println(s);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (bReader != null) {
//				try {
//					bReader.close();
//				} catch (IOException e) {
//
//					e.printStackTrace();
//				}
//			}
//		}
	}

}
