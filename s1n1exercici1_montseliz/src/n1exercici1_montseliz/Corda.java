package n1exercici1_montseliz;

public class Corda extends Instrument{	
	
	//Inicialitzador static
	static {
		System.out.println("L'instrument de corda es prepara per afinar.");
	}
	
	//Bloc d'inicialització d'instància
	{
		System.out.println("L'instrument de corda afina amb un la.");
	}
	
	//Constructors
	public Corda(String nom, float preu) {
		super(nom, preu); 
	}
	
	//Mètode abstracte
	@Override
	public String tocar() {
		return "Està sonant un instrument de corda.";
	}
	
	//Mètode toString
	public String toString() {
		return "L'instrument " + super.getNom() + " costa " + super.getPreu() + " €."; 
	}
}
