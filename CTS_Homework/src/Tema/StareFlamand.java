package Tema;

public class StareFlamand implements IStare {

	Crocodil crocodilPrincipal;
	
	public StareFlamand(Crocodil cr) {
		this.crocodilPrincipal = cr;
	}
	
	public void print(String text) {
	//	String primulCuvant = text.split(" ")[0];
		System.out.println("CROCODIL stare: ");
		this.crocodilPrincipal.setStare(StareCrocodil.Normal);
		this.crocodilPrincipal.afisare(text.replace("CROCODIL stare flamanda: " , ""));
}

}
