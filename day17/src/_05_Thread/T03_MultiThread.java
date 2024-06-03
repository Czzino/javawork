package _05_Thread;

import java.awt.Toolkit;

class BeepThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i < 15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class T03_MultiThread {

	public static void main(String[] args) {

		// main 클래스 시작할떄 main 쓰레드가 시작
		// 그다음 bt start 쓰레드 시작
		Toolkit tookit = Toolkit.getDefaultToolkit();
		BeepThread bt = new BeepThread();
		bt.start();

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
//				tookit.beep();
				System.out.println(i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
