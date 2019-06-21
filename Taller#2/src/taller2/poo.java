package taller2;
import java.util.Scanner;

public class poo {
	
	int codigo;
	
	Scanner teclado = new Scanner(System.in);
	
	//Constructor
	public poo () {
		System.out.println("***BIENVENIDO A NUESTRA APLICACION***");
	}
	
	//metodos
	
	public void vaciar() {
		System.out.println("Determinar codigo de Area");
		System.out.println("Favor Ingresar su codigo de area -> (Ingresar valores numericos)"+"\n"+"___");
		int codigo = teclado.nextInt();
		
		if(codigo == 507) {
			System.out.println("Eres Local");
		}else {
			System.out.println("Siguelo intentando");
		}
		
	}

}
