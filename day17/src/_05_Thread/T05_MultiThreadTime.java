package _05_Thread;

class MultiThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("#");
		}

		System.out.println();
		System.out.println("쓰레드 소요 시간 : " + (System.currentTimeMillis() - T05_MultiThreadTime.startTime));
	}
}

public class T05_MultiThreadTime {
	static long startTime = 0;

	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++) {
			System.out.println("&");
		}
		System.out.println();
		System.out.println("소요 시간 : " + (System.currentTimeMillis() - startTime));

	}

}
