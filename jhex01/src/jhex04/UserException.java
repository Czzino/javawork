package jhex04;

public class UserException extends Exception {
	public UserException() {} // 빈 생성자

	public UserException(String message) { // String 타입 받는 생성자
		super(message);
	}
}
