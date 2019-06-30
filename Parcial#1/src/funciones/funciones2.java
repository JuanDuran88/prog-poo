package funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funciones2 {
	
	public funciones2() {}
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat Decfor = new DecimalFormat();
	
	String nombre;
	int c1;
	int c2;
	int c3;
	int c4;
	int suma;
	
	public void promedio(){
		
		System.out.println("*** CALCULO DE PROMEDIO CALIFICACIONES =) ***");
		System.out.println("Ingresar Nombre del estudiante: ");
		nombre = teclado.nextLine();
		System.out.println("Vaciar calificacion #1");
		c1 = teclado.nextInt();
		System.out.println("Vaciar calificacion #2");
		c2 = teclado.nextInt();
		System.out.println("Vaciar calificacion #3");
		c3 = teclado.nextInt();
		System.out.println("Vaciar calificacion #4");
		c4 = teclado.nextInt();
		
		suma = (c1 + c2 + c3 +c4)/4;
		
		System.out.println("\n");
		System.out.println("Estudiante: "+nombre);
		System.out.println("Promedio calificaciones: "+suma);
		
		if(suma>=71){
			System.out.println("**Aprobado**");
		}else{
			System.out.println("**Reprobado**");
		}
		
		System.out.println("\n");
		System.out.println("***< MUCHAS GRACIAS JUAN M. DURAN >***");
		
	}
	

}
