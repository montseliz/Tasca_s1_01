package n1exercici1_montseliz;

public class Corda extends Instrument{	
	
	//Bloc d'inicialització d'instància
	{
		nom = "piano";
		preu = 12560.8f; 
	}
	
	//Constructors
	public Corda() {
		super(); 
	}
	
	//Mètode abstracte
	@Override
	public String tocar() {
		return " Està sonant un instrument de corda.";
	}
	
	//Mètode toString
	public String toString() {
		return "L'instrument " + this.nom + " costa " + this.preu + " €."; 
	}
}
