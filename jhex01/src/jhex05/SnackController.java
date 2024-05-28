package jhex05;

public class SnackController {
	String kind = "빵";
	String name = "케이크"; 
	String flavor = "블루베리";
	int numOf = 1;    
	int price = 150000;
	Snack snack;
	String result = "";
	
	SnackController(){
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		snack.setKind(kind);
		snack.setName(name);
		snack.setFlavor(flavor);
		snack.setNumof(numOf);
		snack.setPrice(price);
		
		return result;
	}	
	
	public String confirmData(String result) {
		
		return result;
	}
	
}
