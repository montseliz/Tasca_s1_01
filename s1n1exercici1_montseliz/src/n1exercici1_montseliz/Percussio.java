package n1exercici1_montseliz;

public class Percussio extends Instrument{

	//Inicialitzador static
	static {
		System.out.println("L'instrument de percussió es prepara per afinar.");
	}
		
	//Bloc d'inicialització d'instància
	{
		System.out.println("L'instrument de percussió afina amb un la.");
	}
	
	//Constructors
	public Percussio(String nom, float preu) {
		super(nom, preu); 
	}

	//Mètode abstracte
	@Override
	public String tocar() {
		return "Està sonant un instrument de percussió.";
	}

	//Mètode toString
	public String toString() {
		return "L'instrument " + super.getNom() + " costa " + super.getPreu() + " €."; 
	}
}
