package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre......: ");
		String nombre = sc.nextLine();
		
		// Para x = 1 Hasta 10 Hacer
		// for ascendente de 1 al 10 (aumenta de 1 en 1)
		System.out.println("\nFOR ASCENDENTE");
		System.out.println("--------------\n");
		for (int x = 1; x <= 10; x++)
			System.out.println(x + ".- Bienvenido(a) " + nombre + " al curso.");
		
		// Para x = 10 Hasta 0 Hacer con Paso -2
		// for descendente de 10 a 0 (disminuye de 2 en 2)
		System.out.println("\nFOR DESCENDENTE");
		System.out.println("---------------\n");
		for (int i = 10; i > 0; i -= 2)
			System.out.println(i);
	}

}