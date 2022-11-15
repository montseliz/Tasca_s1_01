package n1exercici1_montseliz;

public class Percussio extends Instrument{

	//Bloc d'inicialització d'instància
	{
		nom = "bateria";
		preu = 8460.4f; 
	}
	
	//Constructors
	public Percussio() {
		super(); 
	}

	//Mètode abstracte
	@Override
	public String tocar() {
		return " Està sonant un instrument de percussió.";
	}

	//Mètode toString
	public String toString() {
		return "L'instrument " + this.nom + " costa " + this.preu + " €."; 
	}
}
