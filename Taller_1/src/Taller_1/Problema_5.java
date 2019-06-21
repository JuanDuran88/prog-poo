package Taller_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_5 {
	
	/* Un comerciante compra un articulo a determinado precio y desea saber a cuanto tendra que venderlo para ganarle el 30%. El registro contiene el codigo
	 * del articulo, la descripcion y el precio de costo. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ganancia();

	}
	
	public static void ganancia() {
		String descripcion;
		int codigo;
		int costo;
		double ganancia=0;
		double total=0;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decfor = new DecimalFormat ("0.00");
		
		System.out.println("Calcular Ganancia del 30%");
		System.out.println("Ingrese la descripcion de su Articulo-->");
		descripcion = teclado.nextLine();
		System.out.println("Ingresar el Codigo del articulo-->");
		codigo = teclado.nextInt();
		System.out.println("Ingrese el costo de su articulo-->");
		costo = teclado.nextInt();
		
		total = (costo*0.30)+costo;
		ganancia = costo*0.30;
		
		System.out.println("Codigo: "+codigo);
		System.out.println("Descripcion: "+descripcion);
		System.out.println("Costo: $"+decfor.format(costo));
		System.out.println("Venta: $"+decfor.format(total));
		System.out.println("Ganancia del 30%: $"+decfor.format(ganancia));
		System.out.println("\n");
		
		Scanner waitForKeypress = new Scanner(System.in);
		System.out.println("Presione Enter para salir--> Hasta la proxima!");
		waitForKeypress.nextLine();
	}

}
