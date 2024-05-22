package _03_abstract;

abstract public class Phone {
	// abstract
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	abstract void trunOn();
	abstract void trunOff();
	
}
