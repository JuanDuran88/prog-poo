package taller2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problema4 {
	
	Scanner teclado = new Scanner(System.in);
	float x = 0;
	
	public void programador() {
		System.out.println("***HOLA BIENVENIDO***");
		System.out.println("Favor Ingresar sus años de experiencia como Programador/Desarrollador ->");
		
		try {
		x = teclado.nextFloat();
		
		
		if(x>=6) {
			System.out.println("Su nivel como programador es de Lead");
		}else if(x>=4) {
			System.out.println("Su nivel como programador es de Senior");
		}else if(x>=1) {
			System.out.println("Su nivel como programador es de Intermedio");
		}else if(x>0 && x<1) {
			System.out.println("Su nivel como programador es de Junior");
		}else {
			System.out.println("NO APLICA, favor ingresar caracteres numericos");
		}}catch(InputMismatchException e) {System.out.println("Favor Ingresar valores numericos -> =) Vuelve a Intentarlo");};
	}
	

}
