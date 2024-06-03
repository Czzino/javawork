package _05_Thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		// Thread로부터 상속 받아서 그냥사용
		setName("my쓰레드");
		for (int i = 0; i < 500; i++) {
			System.out.println(getName());
		}
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {

		Thread.currentThread().setName("imple쓰레드");
		for (int i = 1000; i < 1500; i++) {
			System.out.println(i);
		}
	}
}

public class T01_Thread {

	public static void main(String[] args) {
		
		// 객체생성 하지않고 사용
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());

		// 1. 메인쓰레드
		// 2. t1 쓰레드
		// 3. t2 쓰레드
		t1.start();
		t2.start();

	}

}
