package _05_Thread;

import java.awt.Toolkit;

public class T02_Thread {

	// 싱글 쓰레드
	public static void main(String[] args) {
		Toolkit tookit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			// 밀리세컨드 단위
			try {
				Thread.sleep(1000);
				tookit.beep();
				System.out.println(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		for(int i=10; i<15; i++) {
			// 밀리세컨드 단위
			try {
				Thread.sleep(1000);
				tookit.beep();
				System.out.println(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}	
	}


}
