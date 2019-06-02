package Tema;

public class Tigru implements Animal {

	String Carnivor="false";
	String sunet = "RAWR";
	
	
	
	
	
	public Tigru() {
		super();
	}





	public Tigru(String sunet) {
		super();
		this.sunet = sunet;
	}





	@Override
	public void makeSound() {
		System.out.print(sunet + " ");
	}

}
