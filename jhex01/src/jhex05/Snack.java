package jhex05;

public class Snack extends SnackController {
	String kind = "빵";
	String name = "케이크"; 
	String flavor = "블루베리";
	int numOf = 1;    
	int price = 150000;
	
	Snack(){
		
	}
	Snack(String kind, String name, String flavor, int numOf, int price){
		
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	String getKind() {
		return kind;
	}

	void setKind(String kind) {
		this.kind = kind;

	}
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;

	}
	
	String getFlavor() {
		return flavor;
	}

	void setFlavor(String flavor) {
		this.flavor = flavor;

	}
	
	int getNumof() {
		return numOf;
	}

	void setNumof(int numOf) {
		this.numOf = numOf;

	}
	
	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;

	}
	
	
	public String information(String data) {
		
		return data;
	}
}

