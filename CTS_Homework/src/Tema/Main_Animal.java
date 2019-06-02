package Tema;

public class Main_Animal {

	public static void main(String[] args) {
		 //factory
		AnimalFactory animalFactory = new AnimalFactory();

		Animal animal1 = animalFactory.getAnimal("Caine");

		animal1.makeSound();
		
		Caine caine1 =  (Caine) animal1;
		
		System.out.println(caine1.Carnivor);

	     
	      Animal animal2 = animalFactory.getAnimal("Pisica");
	      
	 
	      animal2.makeSound();
	      
	      Pisica pisica1 = (Pisica) animal2;
	      System.out.println(pisica1.Carnivor);
	      
	      
	      Animal animal3 = animalFactory.getAnimal("Tigru");

	      animal3.makeSound();
	      
	      
	      Tigru tigru1 = (Tigru) animal3;
	      
	      System.out.println(tigru1.Carnivor);
	   
	      //builder
	      
	      
	      Alimentatie_Builder builder = new Alimentatie_Builder(caine1,"caine");
	      builder.hraneste("CARNE");

	      System.out.println("Este carnivor? "+caine1.Carnivor);
	      
	      //proxy
	      
	      
	      final Animal an1 = 
	        		new Proxy_Tigru("ARGH");
	        final Animal an2 = 
	        		new Proxy_Tigru("ARRRR");
	 
	        an1.makeSound();
	        an2.makeSound();
	        
	        
	        //decorator
	        
	        RatonSimplu ratonSimplu = new RatonSimplu("raton 1");
			DecoratorRatonDiferit ratonDiferit = new DecoratorRatonDiferit(ratonSimplu);
			
			
			System.out.println(ratonSimplu.getNume());
			System.out.println(ratonDiferit.getNume());
			

			
			System.out.println(ratonSimplu.getNume());
			
			
			DecoratorRaton special= 
					new DecoratorRaton(ratonSimplu) {
				
						@Override
						public String getNume(){
							return this.raton.getNume() + " cu dungi";
						}
					};
	System.out.println(special.getNume());
	        
	
	//STATE
	
	Crocodil croco = new Crocodil();
	
	croco.afisare("test test ");
	
	croco.setStare(StareCrocodil.Flamand);
	
	croco.afisare("test test test?");
	
	
	

	        
	}
	
}
