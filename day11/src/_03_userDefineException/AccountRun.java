package _03_userDefineException;

import _01_aonymous.TestMain; // 같은 프로젝트의 다른 패키지의 것을 쓰려면 그냥 import
import _03_bank.T01_api_bank; // 다른 프로젝트의 클래스를 사용하려면 프로젝트 속성에서 우선 프로젝트를 포함시키고 난후 import

public class AccountRun {
	public static void main(String[] args) {
		T01_api_bank b = new T01_api_bank();
		TestMain aa = new TestMain();
		
		Account bank = new Account();
		bank.deposit(1000);
		try {
			bank.witdraw(10000);
		} catch (UserException e) { // extends 상속받은 Exception 기능을 사용함
			System.out.println(e.getMessage());
		}
		
	}
}
