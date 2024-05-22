package _03_bank;

public class T01_api_bank {
	private int balance;

	// void함수 리턴없음
	void deposit(int money) {
		balance += money;
	}

	void witdraw(int money) {
		if(balance < money) {
			System.out.println("잔고 부족");
		} else {
			balance -= money;
		}
	}

	// 잔고의 값을 리턴
	int getBalance() {
		return balance;
	}
}
