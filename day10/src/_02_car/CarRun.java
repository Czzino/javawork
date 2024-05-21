package _02_car;

import _01_phone.SmartPhone;

public class CarRun {

	public static void main(String[] args) {

		boolean power = false;

		Car car1 = new Car("삼성", "계열사");
		car1.speedUp(100);
		System.out.println("speed : " + car1.speed);
		car1.speedDown(50);
		System.out.println("speed : " + car1.speed);
		car1.powerOn(power);
		System.out.println("파워 :" + power);
		car1.powerOff(power);
		System.out.println("파워 :" + power);
		
		
	}

}
