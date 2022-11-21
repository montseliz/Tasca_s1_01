package n1exercici2_montseliz;

public class Cotxe {
	
	//Atributs
	private static final String MARCA = "Volvo"; 
	private static String model; 
	private final int POTENCIA; 
	
	//Constructor
	public Cotxe(String model, int POTENCIA) { 
		Cotxe.model = model; 
		this.POTENCIA = POTENCIA; 
	}
	
	//Getters
	public String getMARCA() {
		return MARCA; 
	}
	public String getModel() {
		return model; 
	}
	public int getPOTENCIA() {
		return POTENCIA; 
	}
	
	//Setters
	public void setModel(String model) {
		Cotxe.model = model; 
	}
	
	//Mètodes generals
	public static String frenar() {
		return " El vehicle està frenant."; 
	}
	public String accelerar() {
		return " El vehicle està accelerant."; 
	}
	
	//Mètode toString
	public String toString() {
		return "El vehicle de la marca " + Cotxe.MARCA + " i del model " + Cotxe.model + " té una potència de " 
				+ this.POTENCIA + " cavalls."; 
	}
}
