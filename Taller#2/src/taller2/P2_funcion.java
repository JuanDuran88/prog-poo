package taller2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P2_funcion {
	
	float [] inver = new float[10];
	String cliente = null;
	double capital = 0.00;
	int f=0;
	double total = 0.00;
	double inter = 0.02;
	double grantotal = 0.00;
	double pago = 0.00;
	
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat decfor = new DecimalFormat("0.00");
	
	public P2_funcion () {
		System.out.println("***BANCO PANAMA BIENVENIDO A SU BANCA EN LINEA***");
	}
	
	public void registro() {
		System.out.println("Por favor ingrese a continuacion sus datos bancarios ->");
		System.out.println("Ingrese su nombre ->");
		cliente = teclado.nextLine();
		System.out.println("Capital ah Invertir->");
		capital = teclado.nextDouble();
		System.out.println("\n");
		System.out.println("Ingresar transacciones realizadas en el mes -->");
		
		for(int i=0;i<10;i++) {
			System.out.println("Transaccion #"+(i+1)+" ->");
			inver[i] = teclado.nextFloat();
			f += inver[i];
			
		}
		
		total = capital + f;
		
		if(total >=10000) {
			inter += + 0.05;
		}else if(total >=500){
			inter += + 0.03;
		}else if(total >=100) {
			inter += + 0.01;
		}else {
			System.out.println("No Aplica Volver a Intentar");
		}
		
		pago = inter * total;
		
		grantotal = total + pago;
		
		System.out.println("Nombre del cliente: "+cliente);
		System.out.println("Total transacciones: $"+decfor.format(f));
		System.out.println("Saldo disponible: "+"**"+"$"+decfor.format(total)+"**");
		System.out.println("Interes a pagar sobre saldo -> $"+decfor.format(pago));
		System.out.println("Gran Total -> "+"**$"+grantotal+"**");
		System.out.println("\n");
		System.out.println("+++ MUCHAS GRACIAS ATTE. JUAN M. DURAN =) +++");
	}

}
