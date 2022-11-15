package n1exercici2_montseliz;

public class Cotxe {
	
	//Atributs
	static private final String MARCA; 
	static private String model; 
	final private int POTENCIA; 
	
	//Bloc d'inicialització d'static 
	static {
		MARCA = "Volvo"; 
		model = "S40";
	}
	
	//Bloc d'inicialització d'instància
	{
		POTENCIA = 120; 
	}
	
	//Constructor
	public Cotxe() {
	}
	
	public Cotxe(String model) { //L'atribut model és el que es pot inicialitzar al constructor al no ser final. 
		Cotxe.model = model; 
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
