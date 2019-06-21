package Taller_1;

import java.util.Scanner;

/* Realizar un programa que solicite el nombre de una persona y lo imprima */

public class Problema_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		nombre();

	}
	
	
	public static void nombre() {
		String nombre;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a mi Taller #1");
		System.out.println("Ingrese su Nombre: ");
		
		nombre = teclado.next();
		
		System.out.println("Su nombre es: "+ nombre);

	}

}
	
