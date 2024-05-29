package _02_HashMap;

public class Snack {
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

	private String flavor;
	private int calory;
	// 매개변수가 없는 생성자
	// 모든필드가 있는 생성자
	// getter , setter 메소드
	// toString 오버라이딩

	public Snack() {

	}

	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

}
