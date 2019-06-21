package Taller_1;

import java.util.Scanner;

public class Problema_3 {
	
	/* Se requiere calcular la edad de una persona. El registro continene el nombre de la persona y el año en que nacio. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		edad();

	}
	
	public static void edad() {
		String nombre;
		int edad;
		int ano;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hola Favor Introducir su Nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Favor Introducir año de nacimiento (4 digitos) -->");
		edad = teclado.nextInt();
		
		ano = 2019 - edad;
		
		System.out.println("Muchas gracias: "+nombre);
		System.out.println("Su edad es de--> "+ano+" "+"años");
		System.out.println("\n");
		Scanner waitForKeypress = new Scanner(System.in);
		System.out.println("Presione Enter para salir--> Hasta la proxima!");
		waitForKeypress.nextLine();
		
	}

}
