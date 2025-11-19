package Reto;

import java.util.Scanner;

public class Funciones {
	
	//Función que pide por consola hasta que sea un número entero y lo devuelve
	// Muestra el texto que le pasamos como parametro
	public static int dimeEntero(String texto, Scanner sc)
	{
		do
		{
		try {
			System.out.print(texto);
			String s = sc.nextLine();
			int n= Integer.parseInt(s);
			return n;

		} catch (Exception e) {
			System.out.println("Formato incorrecto. No es un número");
		}
		}while(true);
	}
	
	//Función que pide por consola hasta que sea un número decimal y lo devuelve
	// Muestra el texto que le pasamos como parametro
	public static double dimeDouble(String texto, Scanner sc)
	{
		do
		{
		try {
			System.out.println(texto);
			String s = sc.nextLine();
			double d= Double.parseDouble(s);
			return d;

		} catch (Exception e) {
			System.out.println("Formato incorrecto. No es un número");
		}
		}while(true);
	}
}

