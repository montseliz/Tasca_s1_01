package n2exercici1_montseliz;

public class Smartphone extends Telefon implements Camera, Rellotge {

	//Constructors 
	public Smartphone() {
		super();  
	}
	public Smartphone(String marca, String model) {
		super(marca, model); 
	}
	
	//Mètodes abstractes
	@Override
	public String alarma() {
		return "Està sonant l'alarma.";
	}
	@Override
	public String fotografia() {
		return "S'està fent una fotografia.";
	}
	
	//Mètode toString
	public String toString() {
		return "L'smartphone és de la marca " + super.getMarca() + " i del model " + super.getModel() + ".";
	}

}
