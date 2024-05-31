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
