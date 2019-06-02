package Tema;

public class AnimalFactory {
	  
	   public Animal getAnimal(String AnimalType){
	      if(AnimalType == null){
	         return null;
	      }		
	      if(AnimalType.equalsIgnoreCase("Caine")){
	         return new Caine();
	         
	      } else if(AnimalType.equalsIgnoreCase("Pisica")){
	         return new Pisica();
	         
	      } else if(AnimalType.equalsIgnoreCase("Tigru")){
	         return new Tigru();
	      }
	      
	      return null;
	   }

}
