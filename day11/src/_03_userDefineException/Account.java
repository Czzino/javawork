package _03_userDefineException;

public class Account {
	private int balance;

	void deposit(int money) {
		balance += money;
	}

	void witdraw(int money) throws UserException  { // , 하고 추가 Exception 할수 있음
		if (balance < money) {
			// 강제로 Exception 발생 시킴
			throw new UserException("잔고부족 : " + (money-balance) + " 원 " + "모자람");
		} else {
			balance -= money;
		}
	}

	// 잔고의 값을 리턴
	int getBalance() {
		return balance;
	}
}
