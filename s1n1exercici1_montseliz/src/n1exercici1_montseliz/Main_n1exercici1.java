package n1exercici1_montseliz;

public class Main_n1exercici1 {

	public static void main(String[] args) {
		
		Vent flauta = new Vent("flauta travessera", 2500.6f); 
		System.out.println(flauta.tocar()+ "\n" + flauta.toString());  
		
		Vent trombo = new Vent("trombo de vares", 3594.6f); 
		System.out.println(trombo.tocar());
		
		Corda piano = new Corda("piano", 12560.8f);
		System.out.println(piano.tocar() + "\n" + piano.toString()); 
		
		Percussio bateria = new Percussio("bateria", 8460.4f);
		System.out.println(bateria.tocar()); 
		
		Corda guitarra = new Corda("guitarra elèctrica", 6467.7f); 
		System.out.println(guitarra.tocar()); 
		
	}

}
