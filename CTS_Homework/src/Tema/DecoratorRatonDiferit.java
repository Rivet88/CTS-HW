package Tema;

public class DecoratorRatonDiferit extends DecoratorRaton{
	public DecoratorRatonDiferit(AbstractRaton raton){
		super(raton);
	}
	
	@Override
	public String getNume(){
		return super.getNume() + ", diferit";
}
}
