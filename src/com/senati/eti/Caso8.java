package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Correcto....: Entre 1 y 30 -> n >= 1 && n <= 30
		// Incorrecto..: No se encuentra entre 1 y 30 -> n < 1 || n > 30
		
		int n = 0;
		
		while (n < 1 || n > 30) {
			System.out.print("\nIngrese número [1-30]....: ");
			n = sc.nextInt();
			
			if (n < 1 || n > 30)
			    System.out.println("Número fuera de rango\nSolo ingrese [1-30]");
		}
		
		System.out.println("Tabla de Multiplicar del " + n);
		System.out.println("--------------------------");
		
		for (int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n * i));

		System.out.println("--------------------------");
	}
	
}	