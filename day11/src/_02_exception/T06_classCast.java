package _02_exception;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class T06_classCast {

	public static void main(String[] args) {
		// 자식이 부모한테 형변환 가능
		try {
			Animal ani = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();

			Animal aniDog = dog;
			Animal aniCat = cat;

			dog = (Dog) aniDog;
			dog = (Dog) ani; // 예외발생
//			if(ani instanceof Dog) {
//				dog = (Dog)ani; // 예외발생 
//			} else {
//				System.out.println("변경불가");
//			}
		} catch (ClassCastException e) {
			System.out.println("부모 타입을 자식의 타입으로 형변환할 수 없음");

		}

//		Dog dog = new Dog();
//		Animal animal dog = new Anmial();
//		// null 체크 먼저
//		// 클래스 이름 생략가능
//		if((change(dog)) == null) {
//			System.out.println("변환 불가");
//		} else {
//			dog = change(dog);
//		}

	}

	// 객체 생성 해야 사용할수 있음
	// static 안붙으면 객체 생성
//	public static Dog change(Animal animal) {
//		// 타입을 확인하는 instanceof
//		Dog dog = null;
//		if(animal instanceof Dog){
//		    dog = (Dog)animal;	
//		} else {
//			System.out.println("변경 불가");
//		}
//		return dog;
//	}

}
