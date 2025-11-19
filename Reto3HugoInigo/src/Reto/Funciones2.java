package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones2 {

	public static void contarPalabras(Scanner sc) {
		int espacios = 0;
		String frase = sc.nextLine();
		frase+=" ";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
			} else {
				espacios++;
			}
		}
		System.out.println(espacios);
	}

	public static void invertirFrase(Scanner sc) {
		int aux = 0;
		String inverso = "";
		String frase = " "+sc.nextLine()+" ";
		for (int i = frase.length()-2; i >= 0; i--) {
			if (frase.charAt(i)==' '||i==0) {
				inverso+=" ";
				for (int f = i+1; frase.charAt(f)!=' '; f++) {
				inverso+=frase.charAt(f);
				}
			}
		}
		System.out.println(inverso);
	}
	
	public static void menu2() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion = 1;
		do {
		String menu = """ 
				Analizar:
				1. Contar palabras
				2. Invertir palabra
				3. Palabra mas larga
				0. Salir
				""";
		System.out.println(menu);
		opcion = Funciones.dimeEntero("Opcion: ", sc);
			switch (opcion) {
			default -> System.out.println("Opcion no valida"); 
			case 1 -> contarPalabras(sc);
			case 2 -> invertirFrase(sc);
			}
		} while (opcion!=0);
	}
	

}
