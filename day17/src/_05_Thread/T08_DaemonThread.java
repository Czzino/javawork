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

		// setDaemon(); 기본값이 false
		// 어떤 역활의 보조 역할
		t.setDaemon(true);
		t.start();
		
		// main 쓰레드가 끝나면 Daemon 도 끝남
		for(int i=1; i<=10; i++) {
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
