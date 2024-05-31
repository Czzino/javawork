package _01_generics;

class Box {
	private Object object;

	void set(Object object) {
		this.object = object;
	}

	Object get() {
		return object; 
	}
}

class Auction{
	
}

public class T01_nonGenerics {

	public static void main(String[] args) {
		
		// Extends하지않으면 강제 형변환
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Auction());
		Auction a = (Auction)box.get();
	}

}
