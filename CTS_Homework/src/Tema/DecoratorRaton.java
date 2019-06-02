package Tema;

public abstract class DecoratorRaton extends AbstractRaton {
protected final AbstractRaton raton;
	
	public DecoratorRaton(AbstractRaton Raton){
		this.raton = Raton;
	}
	
	@Override
	public String getNume() {
		return raton.getNume();
}

}
