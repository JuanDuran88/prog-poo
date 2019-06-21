package Taller_1;

import java.util.Scanner;

public class Problema_2 {
	
	/* Se requiere de un programa para calcular la edad de una persona. El registro contiene nombre, apellido y año que nacio, se debe imprimir el nombre
	 * completo y la edad */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		viejo();

	}
	
	public static void viejo() {
		String nombre="";
		String apellido="";
		int ano;
		int edad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hola Buenas Tardes, con el siguiente programa calcularemos su edad");
		System.out.println("Favor Introducir su Nombre y Apellido");
		nombre = teclado.nextLine();
		apellido = teclado.nextLine();
		System.out.println("Favor Introduzca su año de nacimiento (4 digitos) -->");
		ano = teclado.nextInt();
		System.out.println("Muchas gracias: "+ nombre +" "+ apellido);
		edad = 2019 - ano;
		System.out.println("Su edad es de: "+edad+" "+"años");
	}

}
