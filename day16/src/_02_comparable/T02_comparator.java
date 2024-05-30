package _02_comparable;

import java.util.Arrays;
import java.util.Comparator;

class Decending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c2.compareTo(c1);

		}
		return -1;
	}
}

public class T02_comparator {

	public static void main(String[] args) {

		// sort 대소문자 가림
		String[] strArr = { "cat", "tiger", "Dog", "lion" };
		Arrays.sort(strArr); // sort 정렬함수 내부 함수
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println(Arrays.toString(strArr));

		// 역순으로 정렬
		// 두값을 비교해서 정렬
		Arrays.sort(strArr, new Decending());
		System.out.println(Arrays.toString(strArr));
	}

}
