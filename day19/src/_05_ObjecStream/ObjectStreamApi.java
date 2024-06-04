package _05_ObjecStream;

import java.io.*;

public class ObjectStreamApi {

	// ObjectOutputStream 보조 스트림 사용
	// 출력 메소드 : writeObject(객체);
	// 입력 메소드 : readObject();

	// 객체를 파일로 출력

	void fileSave() {
		Phone p1 = new Phone("갤럭시", 2000000);
		Phone p2 = new Phone("iphone", 1800000);
		Phone p3 = new Phone("xiaoming", 800000);

		// 기반 스트림 : FileOutputStream(1byte 단위로 출력할수 있는 스트림)
		// 보조스트림 생성으로 close 안해도됨
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_object.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_object.txt"))) {
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());

			while (true) {
				System.out.println(ois.readObject());
			}

		} catch (EOFException e) {
			System.out.println("파일을 모두 읽었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
