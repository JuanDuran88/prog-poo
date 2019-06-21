package taller2;
import java.util.Scanner;

public class problema_3_funciones {
	
	Scanner teclado = new Scanner(System.in);
	
	char letra;
	
	public problema_3_funciones() {}
	
	public void palabras() {
		System.out.println("***Validar el tipo de caracter ingresado si es una vocal o es una palabra***");
		System.out.println("A continuacion digite un caracter ->");
		letra = teclado.next().charAt(0);
		
		
		switch(letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Es una vocal minuscula -> =) "+letra); break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':System.out.println("Es una vocal mayuscula -> =) "+letra); break;
			default :System.out.println("Es una palabra");
		}

	}

}
