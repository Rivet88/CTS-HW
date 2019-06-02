package Tema;

public class Alimentatie_Builder {
	public Animal animal;
	public String nume;
	
	public Caine c;
	public Pisica p;
	public Tigru t;
	
	
	public Alimentatie_Builder(Animal animal, String nume) {
		super();
		this.animal = animal;
		this.nume = nume;
		
		
		
	}



	public void hraneste(String hrana) {
		
		
		if(nume.compareTo("caine")==0 ) {
			
			c  = (Caine) animal; 
			
			
			if(hrana.contentEquals(Alimentatie.CARNE.toString())) c.Carnivor ="true";
			
			
		}
			
			
		if(nume.compareTo("pisica")==0 ) {
			p  = (Pisica) animal; 
			if(hrana.contentEquals(Alimentatie.CARNE.toString())) p.Carnivor ="true";
			
		}
		
		if(nume.compareTo("tigru")==0 ) {
			t  = (Tigru) animal; 
			if(hrana.contentEquals(Alimentatie.CARNE.toString())) t.Carnivor ="true";
		}
		
		
		
	}
}
