package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", rpta = "S", estado = "";
		int edad = 0, num_reg = 0, n_aptos = 0;
		
		while (rpta.equals("S") || rpta.equals("s")) {
			num_reg++;
			System.out.println("-----------------------");
			System.out.println("REGISTRO " + num_reg + ":");
			System.out.println("-----------------------");
			
			System.out.print("Nombre......: ");
			nombre = sc.nextLine();
			System.out.print("Edad........: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				n_aptos++;
			}
			else
				estado = "Menor de edad";
			
			System.out.print("Estado......: " + estado);
			
			sc.nextLine(); // Limpieza de buffer
			
			System.out.print("¿Desea registrar otro participante? <5/N>: ");
			rpta = sc.nextLine();
		}
		
		// Mostrar el resumen
		System.out.println("-------------");
		System.out.println("R E S U M E N");
		System.out.println("-------------");
		System.out.println("Participantes registrados...: " + num_reg);
		System.out.println("Aptos para votar............: " + n_aptos);
	}

}
