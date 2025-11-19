package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in).useLocale(Locale.US);
			int opcion = 1;
			do {
			String menu = """ 
					Analizar:
					1. Palabras
					2. Frases
					0. Salir
					""";
			System.out.println(menu);
			opcion = Funciones.dimeEntero("Opcion: ", sc);
				switch (opcion) {
				default -> System.out.println("Opcion no valida"); 
				case 1 -> Funciones2.invertirFrase(sc);
				}
			} while (opcion!=0);
		
		
		

	}

	public static void palabras() {
		
		
		
		
	}
	
	
	
	
}
