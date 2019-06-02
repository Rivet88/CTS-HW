package Tema;

public class Crocodil {
	IStare stareCurenta;
	
	public Crocodil(){
		stareCurenta = new StareNormal();
	}
	
	public void setStare(StareCrocodil stare){
		if(stare == StareCrocodil.Normal)
			this.stareCurenta = new StareNormal();
		else
			if(stare == StareCrocodil.Flamand)
				this.stareCurenta = new StareFlamand(this);
			
	}
	
	public void afisare(String text){
		this.stareCurenta.print(text);
}
}
