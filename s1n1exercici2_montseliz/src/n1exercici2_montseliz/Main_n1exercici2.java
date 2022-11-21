package n1exercici2_montseliz;

public class Main_n1exercici2 {

	public static void main(String[] args) {
		
		Cotxe cotxe = new Cotxe("S40", 120);
		System.out.println(cotxe.toString() + cotxe.accelerar()); //accelerar() només es pot cridar amb objectes. 
		
		Cotxe cotxe1 = new Cotxe("XC90", 160); 
		System.out.println(cotxe1.toString() + Cotxe.frenar() + cotxe.frenar()); //frenar() es pot cridar amb l'objecte o la classe.
		
		System.out.println(cotxe.toString() + Cotxe.frenar()); //Mateix model, perquè és static. Si es modifica, es canvia a tots els objectes. 
		
		cotxe.setModel("V40");
		System.out.println(cotxe.toString()); 
		
		
		

	}

}
