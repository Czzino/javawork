package _03_bank;

public class T01_main_bank {

	public static void main(String[] args) {
		T01_api_bank bank = new T01_api_bank();
		
		// 돈을 맡기는 기능
		bank.deposit(1000);
		System.out.println("잔액 : " + bank.getBalance());
		
		bank.witdraw(500);
		System.out.println("잔액 : " + bank.getBalance());
		
		// 돈을 찾는 기능
		bank.witdraw(800);
	}

}
