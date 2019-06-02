package Tema;

public class Proxy_Tigru implements Animal{
	private Tigru tigruReal = null;
	private String sound=null;
	
	

	public Proxy_Tigru(String sound) {
		super();
		this.sound = sound;
	}



	@Override
	public void makeSound() {
		if(tigruReal == null)
			tigruReal = new Tigru(sound); 
		tigruReal.makeSound();
		
		
	}
}
