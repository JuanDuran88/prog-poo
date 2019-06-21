package Taller_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_4 {
	
	/* Un comercio requiere que le imprima la cantidad a pagar de un cliente incluyendo el I.T.B.M.S y mostrar el nombre del cliente y monto a pagar */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factura();

	}
	
	public static void factura() {
		String cliente;
		int compra;
		double monto;
		double total=0;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decfor = new DecimalFormat ("0.00");
		
		System.out.println("MUCHAS GRACIAS POR SU COMPRA VUELVA PRONTO!");
		System.out.println("Introducir Nombre del Cliente: ");
		cliente = teclado.nextLine();
		System.out.println("Introducir Total Compra--> ");
		compra = teclado.nextInt();
		
		monto = compra*0.07;
		total = compra + monto;
		
		System.out.println("Cliente: "+cliente);
		System.out.println("Venta "+"$"+decfor.format(compra));
		System.out.println("Impuesto $"+decfor.format(monto));
		System.out.println("Gran Total $"+decfor.format(total));
		
		Scanner waitForKeypress = new Scanner(System.in);
		System.out.println("Presione Enter para salir--> Hasta la proxima!");
		waitForKeypress.nextLine();
	}

}
