package n1exercici1_montseliz;

public abstract class Instrument {

	//Atributs
	protected String nom; 
	protected float preu; 	
	
	//Constructor
	public Instrument() {
	}
	
	//Getters
	public String getNom() {
		return nom; 
	}
	public float getPreu() {
		return preu; 
	}
	
	//Setters
	public void setNom(String nom) {
		this.nom  = nom; 
	}
	public void setPreu(float preu) {
		this.preu = preu; 
	}
	
	//Mètode abstracte
	public abstract String tocar(); 
	
	//Mètode toString
	public String toString() {
		return "L'instrument " + this.nom + " costa " + this.preu + " €."; 
	}
}
