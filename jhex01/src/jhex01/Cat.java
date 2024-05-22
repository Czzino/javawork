package jhex01;

public class Cat extends Pet {

	Cat() {
		this("고양이", "검은색", "새침함");
	}

	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}

	@Override
	void info() {
		System.out.println("종류" + kind + "색상 : " + color + "특징" + feature);
	}
}
