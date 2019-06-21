package Taller_1;

import java.util.Scanner;

public class Problema_6 {
	
	/* Un deportista corre todos los dias una distancia de 1 kilometro y registra el tiempo utilizado en su practica. Se desea saber el promedio de tiempo si
	 * este deportista practico 5 dias esta semana. El registro contiene el nombre del deportista y cada uno de los 5 tiempos registrados. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		corredor();

	}
	
	public static void corredor() {
		String nombre;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("REGISTRO DE TIEMPOS");
		System.out.println("Ingresar nombre del corredor: ");
		
		nombre = teclado.nextLine();
		
		System.out.println("Cuantos registros va ha ingresar? (Maximo 5)");
		int p = teclado.nextInt();
		double arreglo[]= new double[p];
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingresar Registro "+(i+1)+": ");
			double n = teclado.nextDouble();
			arreglo[i]=n;
			
		}
		System.out.println("\n");
		System.out.println("		RESUMEN DE REGISTROS INGRESADOS		");
		System.out.println("\n");
		for(int i=0;i<arreglo.length;i++)
		{System.out.println("Registro: "+(i+1)+"."+" "+"**"+arreglo[i]+"**"+" Tiempo en minutos/segundos");}
		System.out.println("\n");
		
		Scanner waitForKeypress = new Scanner(System.in);
		System.out.println("Presione Enter para salir--> Hasta la proxima!");
		waitForKeypress.nextLine();
	}

}
