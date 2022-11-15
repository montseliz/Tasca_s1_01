package n2exercici1_montseliz;

public class Main_n2exercici1 {

	public static void main(String[] args) {
	 
		Smartphone smartphone = new Smartphone ("Iphone", "X"); 

		System.out.println(smartphone.toString());
		System.out.println(smartphone.trucar("628507133") + "."); 
		System.out.println(smartphone.alarma() + " " + smartphone.fotografia());
		
	}

}
