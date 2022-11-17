package n1exercici1_montseliz;

public abstract class Instrument {

	//Atributs
	private String nom; 
	private float preu; 	
	
	//Inicialitzador static
	static {
		System.out.println("Els intruments es preparen per afinar.");
	}
	
	//Constructor
	public Instrument(String nom, float preu) {
		this.nom = nom;
		this.preu = preu; 
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
