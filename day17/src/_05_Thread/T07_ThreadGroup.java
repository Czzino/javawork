package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {

		// 현재돌아가고 있는 쓰레드가 main
		ThreadGroup groupName = Thread.currentThread().getThreadGroup();
		System.out.println(groupName.getName());

		// subGrp1 = grp1 그룹 상속
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

		Runnable r = new Runnable() {
			public void run() {

				try {

					Thread.sleep(1000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		// Thread(ThreadGroup tg, Runnable r, String name)
		Thread th4 = new Thread(r); // main쓰레드
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th2");
		Thread th3 = new Thread(grp2, r, "th3");

		th1.start();
//		th1.join();
		th2.start();
		th3.start();

		// main 에서 실행되서 main 이름 얻어오기
		// list 가운데 숫자값은 property
		System.out.println("List of ThreadGroup : " + groupName.getName());
		System.out.println("Active ThreadGroup : " + groupName.activeGroupCount()); // 그룹이 몇개 활성화 되어 있는지
		System.out.println("Active Thread : " + groupName.activeCount()); // 현재 돌아가고 있는 쓰레드
		groupName.list();

	}

}
