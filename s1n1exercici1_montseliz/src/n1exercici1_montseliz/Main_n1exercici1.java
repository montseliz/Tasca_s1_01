package n1exercici1_montseliz;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		
		Vent flauta = new Vent(); 
		System.out.println(flauta.toString() + flauta.tocar());  
		
		Corda piano = new Corda();
		System.out.println(piano.toString() + piano.tocar()); 
		
		Percussio bateria = new Percussio();
		System.out.println(bateria.toString() + bateria.tocar()); 
		
	}

}
