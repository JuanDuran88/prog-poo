package funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funciones3 {
	
	public funciones3(){};
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat Decfor = new DecimalFormat("0.00");
	
	int traje;
	int p=75;
	double d;
	int sub;
	double t;
	
	public void comercio(){
		System.out.println("***BIENVENIDO A SU TIENDA DE TRAJES =) ***");
		System.out.println("Ingrese el total de trajes comprados: ->");
		System.out.print("__...");
		
		do {
		traje = teclado.nextInt();
		sub = traje * 75;
		
		if(traje>=3){
			d = sub * 0.65;
		}
		else if(traje>=2){
			d = sub * 0.55;
		}
		else if(traje<2 && traje>0){
			d = sub * 0.50;
		}
		else {
			System.out.println("Opcion no valida vuelva a intentarlo");
		}}while(traje<=0);
		
		t = sub - d;
		
		System.out.println("\n");
		System.out.println("Precio unitario x Traje -> $75.00");
		System.out.println("Sub-Total: -> $"+Decfor.format(sub));
		System.out.println("Descuento x -> "+traje+" trajes $"+Decfor.format(d));
		System.out.println("Gran-Total a pagar -> $"+Decfor.format(t));
	}

}
