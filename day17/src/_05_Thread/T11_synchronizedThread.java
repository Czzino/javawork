package _05_Thread;

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	// 쓰레드 두개에서 동시에 찾지 않도록 하는기능
	synchronized void withdraw(int money) {
		if (balance >= money) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}

}

class ThreadC implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.getBalance() >= 0) {
			int money = ((int) (Math.random() * 3) + 1) * 100;
			System.out.println("출금액 : " + money);
			acc.withdraw(money);
			System.out.println("잔액 : " + acc.getBalance());
		}
	}
}

public class T11_synchronizedThread {

	public static void main(String[] args) {

		// 1. extends Thread 했을떄
		// Thread t1 = new Thread();
		// t1.start();

		// 2. implemnets Runnable 했을 떄
//		Thread t2 = new Thread(new ThreadC());
//		t1.start();
//		Thread t2 = new Thread(new ThreadC());
//		
//		Runnable r = new ThreadC();
//		Thread t3 = new Thread(r);
//		t3.start();

		// 두줄로
//		Runnable r = new ThreadC();
//		new Thread(r).start();
//		
//		// 한줄로
//		new Thread(new ThreadC()).start();

		Runnable r = new ThreadC();
		new Thread(r).start();
		new Thread(r).start();

	}

}
