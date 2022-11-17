package n1exercici1_montseliz;

public class Vent extends Instrument {

	//Inicialitzador static
	static {
		System.out.println("L'instrument de vent es prepara per afinar.");
	}
		
	//Bloc d'inicialització d'instància
	{
		System.out.println("L'instrument de vent afina amb un la.");
	}
	
	//Constructors
	public Vent(String nom, float preu) {
		super(nom, preu); 
	}

	//Mètode abstracte
	@Override
	public String tocar() {
		return "Està sonant un instrument de vent.";
	}	
	
	//Mètode toString
	public String toString() {
		return "L'instrument " + super.getNom() + " costa " + super.getPreu() + " €."; 
	}
}
