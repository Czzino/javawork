package _05_Thread;

class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			autoSave();
		}
	}

	void autoSave() {
		System.out.println("파일이 자동 저장됨");
	}
}

public class T08_DaemonThread {

	public static void main(String[] args) {

		AutoSaveThread t = new AutoSaveThread();

		// 어떤 조건이 만족할떄 사용
		t.setDaemon(true);
		t.start();
		
		for(int i=0; i<=10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}

}
