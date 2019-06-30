package funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funciones4 {
	
	public funciones4(){};
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat Decfor = new DecimalFormat("0.00");
	
	int habi [] = {1, 2, 3, 4, 5};
	int tarifa [] = {120, 155, 210, 185, 400};
	int dias;
	int h;
	int p;
	String nombre;
	boolean repetir = false;
	int sub;
	double d;
	double t;
	
	public void hotel(){
		
		do{
		try{
		repetir = false;
		System.out.println("***+BIENVENIDO AL HOTEL GUAMUCHIL+***");
		System.out.print("Ingrese su Nombre ->");
		nombre = teclado.nextLine();
		System.out.println("Seleccione una habitacion del 1-5 ->");
		h = teclado.nextInt();
		}catch(Exception e){teclado.nextLine(); h=0; System.out.println("Favor Introducir valores Numericos");repetir=true;}}while(repetir);
		
		do {
		for(int i=0;i<5;i++){
			if(h==habi[i]){
				p=i;
			}}
		}while(h<=0 && h>5);
		
		System.out.println("Ingrese el total de dias de su hospedaje: -> ");
		System.out.print("__...");
		dias = teclado.nextInt();
		
		if(dias>15){
			d = 0.20;
		}
		else if(dias>10){
			d = 0.15;
		}
		else if(dias>5){
			d = 0.10;
		}
		else if(dias<=5 && dias>=0){
			System.out.println("No aplica descuento!");
		}
		else{System.out.println("Favor ingresar valores positivos!");}
		
		sub = tarifa[p] * dias;
		d = d * sub;
		t = sub - d;
		
		System.out.println("\n");
		System.out.println("***RESUMEN REPORTE***");
		System.out.println("Muchas gracias Sr@. -> "+nombre);
		System.out.println("Total dias para su hospedaje -> "+dias);
		System.out.println("Habitacion No."+habi[p]);
		System.out.println("tarifa x noche $"+Decfor.format(tarifa[p]));
		System.out.println("Sub-Total -> $"+Decfor.format(sub));
		System.out.println("Descuento si aplica -> $"+Decfor.format(d));
		System.out.println("Gran-Total -> $"+Decfor.format(t));
		
	}

}
