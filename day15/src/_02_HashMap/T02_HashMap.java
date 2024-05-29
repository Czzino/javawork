package _02_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myID", "1234");
		map.put("idKim", "1111");
		map.put("idjiwon", "1124");

		// 사용자로 부터 id와 pw받아서
//		Scanner scan = new Scanner(System.in);
//		System.out.println("id와 pw를 입력 해주세요.");
//
//		String id = scan.next();
//		String pw = scan.next();
//		for (String key : map.keySet()) {
//			String value = map.get(key);
//
//			System.out.println("Key:11" + key + ", Value11:" + value);
//			if (map.containsKey(key)) {
//				map.put(key, value);
//				map.put(key, value);
//				map.put(key, value);
//				System.out.println("Key:" + key + ", Value:" + value);
//				return;
//			}
//			if (key != id) {
//				System.out.println("입력한 id는 없습니다.");
//			}
//			if (key != pw) {
//				System.out.println("pw가 맞지 않습니다.");
//			}
//
//		}

		// 강사님코드
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("id 입력 : ");
			String id = sc.nextLine();
			System.out.print("pw 입력 : ");
			String pw = sc.nextLine();
			if (map.containsKey(id) && map.get(id).equals(pw)) {

				System.out.println("로그인 되었습니다");
				break;
			} else if (map.containsKey(id)) {
				System.out.println("id가 없습니다.");
			} else {
				System.out.println("pw가 틀립니다.");
			}
		}

	}

}
