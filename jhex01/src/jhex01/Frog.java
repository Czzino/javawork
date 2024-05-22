package jhex01;

public class Frog extends Pet {
	Frog(){
		this("개구리","노란색","활발함");
	}
	Frog(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("개굴개굴");
	}
	@Override
	void info() {
		System.out.println("종류" + kind + "색상 : " + color + "특징" + feature);
	}
}
