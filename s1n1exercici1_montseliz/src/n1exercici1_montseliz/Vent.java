package n1exercici1_montseliz;

public class Vent extends Instrument {

	//Bloc d'inicialització d'instància
	{
		nom = "flauta travessera";
		preu = 2500.6f; 
	}
	
	//Constructors
	public Vent() {
		super(); 
	}

	//Mètode abstracte
	@Override
	public String tocar() {
		return " Està sonant un instrument de vent.";
	}	
	
	//Mètode toString
	public String toString() {
		return "L'instrument " + this.nom + " costa " + this.preu + " €."; 
	}
}
