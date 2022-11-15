package n1exercici2_montseliz;

public class Main_n1exercici2 {

	public static void main(String[] args) {
		
		Cotxe cotxe = new Cotxe();
		System.out.println(cotxe.toString() + cotxe.accelerar() + Cotxe.frenar()); 
		
		Cotxe cotxe1 = new Cotxe("XC90"); 
		System.out.println(cotxe1.toString()); 
		
		

	}

}
