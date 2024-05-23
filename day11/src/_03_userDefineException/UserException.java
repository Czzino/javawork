package _03_userDefineException;

public class UserException extends Exception {
	public UserException() {} // Exception 사용할때는 extends 반드시
	public UserException(String message) { // String 타입 받는 생성자
		super(message);
	}
}
