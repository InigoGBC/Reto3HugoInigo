package Reto;

import java.util.Scanner;

public class Funciones2 {

	public static void palabraLarga(Scanner sc) {
		String palabra = " ";
		String larga = " ";
		String frase = " "+sc.nextLine()+" ";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				palabra+=frase.charAt(i);
			} else {
				if (palabra.length()>larga.length()) {
					larga=palabra;
				}
				palabra="";
			}	
		}
		System.out.println("La palabra mas larga es "+larga+" con "+larga.length()+" caracteres");
	}
	
	public static void contarPalabras(Scanner sc) {
		int espacios = 0;
		String frase = sc.nextLine()+" ";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
			} else {
				espacios++;
			}
		}
		System.out.println(espacios);
	}

	public static void invertirFrase(Scanner sc) {
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
	
	public static void menu2(Scanner sc) {
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
			case 3 -> palabraLarga(sc);
			}
		} while (opcion!=0);
	}
	

}
