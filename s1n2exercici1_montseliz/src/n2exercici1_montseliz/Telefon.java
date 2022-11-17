package n2exercici1_montseliz;

public class Telefon {

	//Atributs
	private String marca; 
	private String model; 
	
	//Constructors
	public Telefon(String marca, String model) {
		this.marca = marca; 
		this.model = model; 
	}
	
	//Getters
	public String getMarca() {
		return marca; 
	}
	public String getModel() {
		return model; 
	}
	
	//Setters
	public void setMarca(String marca) {
		this.marca = marca; 
	}
	public void setModel(String model) {
		this.model = model; 
	}
	
	//Mètodes generals
	public String trucar(String numeroTelefon) {
		return "S'està trucant al " + numeroTelefon; 
	}
}
