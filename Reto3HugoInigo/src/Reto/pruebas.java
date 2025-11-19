package Reto;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("dime una ");
		String palabra = sc.nextLine();
		System.out.println(Funciones1.generarApodo(palabra));
		System.out.println(Funciones1.capitalizarString(palabra));
		
	}
	
}
