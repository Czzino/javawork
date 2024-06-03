package _02_multiGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		// 객체 생성할떄 마지막은 써도되고 안써도됨
		Product<Tv, String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		
		Tv kind = p1.getKind();
		String model = p1.getModel();
	
		System.out.println("제품 명 : " + kind + " / 모델명" + model);
		
		// 제네릭 타입 자동형변환
		Product<Car, Integer> p2 = new Product<>();
//		Product<Car, String> p2 = new Product<>();
//		Product<Car, Boolean> p2 = new Product<>();
		
		p2.setKind(new Car());
		p2.setModel(2024);
		
		Car kindCar = p2.getKind();
		int modelCar = p2.getModel();
		System.out.println("제품 명 : " + kindCar + " / 모델명" + modelCar + "몇년형 SUV");
		
		// 타입은 제네릭이라 모든타입이 들어올수 있음
		Product<String, Double> p3 = new Product<>();
		Product<Car, Tv> p4 = new Product<>();
	}

}
