package Reto;

import java.util.Scanner;

public class Funciones1 {

	public static String capitalizarString(String palabra) {
		return palabra.substring(0,1).toUpperCase()+palabra.substring(1);
		}
	
	public static String generarApodo(String palabra) {
		if (palabra.length()<=4) {
			return palabra+palabra.length()
;		}
			
		return palabra.substring(0, 3)+palabra.charAt(palabra.length()-1)+palabra.length();
	
	}
	
	
	public static void menu1(Scanner sc) {
		String nombre;
		
		do {
			System.out.println("dime un nombre ");
		 nombre = sc.nextLine();
		} while (!("".isEmpty()));
		
		System.out.println(Funciones1.capitalizarString(nombre));
		System.out.println("apodo: " + Funciones1.generarApodo(nombre));
		
	}
	
}

