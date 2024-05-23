package _02_exception;

public class T09_tryCatchFinally {

	public static void main(String[] args) {

		// run argment String[] 에 들어간값 출력

		// finally
		/*
		 * try {
		 * 
		 * } catch() {
		 * 
		 * } finally { // 예외와 상관없이 실행 // try와 catch에 retrun이 있어도 실행됨 } 출력문(try catch
		 * retrun이 있으면 실행하지 않음)
		 */

		try {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[4]);
			return; // 수행하고 있는 메소드를 종료
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 넘어섬");
		} finally {

			System.out.println("프로그램 종료");
		}
		System.out.println("ddddd"); // 오류가나고 수행이 안됨
	}

}
