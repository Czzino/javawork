package jhex01;

abstract public class Pet {
	String kind;
	String color;
	String feature;

	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}

	abstract void sound();

	abstract void info();

	String getKind() {
		return kind;
	}

	String getColor() {
		return color;
	}

	String getFeature() {
		return feature;
	}

	@Override
	public String toString() {
		return "종류 : " + ":" + kind + "," + "색상" + ":" + color + ":" + ", 특징" + feature;
	}

}
