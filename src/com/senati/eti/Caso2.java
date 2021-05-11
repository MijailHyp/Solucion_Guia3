package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		//sumatoria
		// r = 1 + 2 + 3 +....n
		
		int x = 1;    //Contador
		int suma = 0; //Acumulador
		
		while (x <= n) {
			suma += x;
			if (x < n)
				System.out.print(x + " + ");
			else
				System.out.print(x + " = " + suma);
			x++;
			
		}
		
		/*
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sumatoria..: "+ suma);*/
		
	}

}