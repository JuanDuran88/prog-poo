package taller2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problema5_funciones {
	
	Scanner teclado = new Scanner(System.in);
	
	int opcion;
	
	public void uip() {
		
		System.out.println("***HOLA BIENVENIDO A LA UNIVERSIDAD INTERAMERICANA DE PANAMA***");
		System.out.println("Favor elija una Facultad para consultar el # de carreras->");
		System.out.print("+++++Menu Principal+++++");
		System.out.println("\n");
		System.out.println("1. Facultad de Ingenieria");
		System.out.println("2. Facultad de Ciencias de la Salud");
		System.out.println("3. Facultad de Ciencias Politicas");
		System.out.println("4. Facultad de Admon de Empresas");
		
		try {
		opcion = teclado.nextInt();
		
		switch(opcion) {
		
		case 1: {
			System.out.println("La facultad cuenta con 6 carreras");
		}break;
		case 2: {
			System.out.println("La facultad cuenta con 10 carreras");
		}break;
		case 3: {
			System.out.println("La facultad cuenta con 4 carreras");
		}break;
		case 4: {
			System.out.println("La facultad cuenta con 8 carreras");
		}break;
		
		}}catch(InputMismatchException e) {System.out.println("NO APLICA, Favor seleccionar de las opciones del Menu gracias!");};
		System.out.println("*** MUCHAS GRACIAS POR SU CONSULTA =) ***");
		
	}

}
