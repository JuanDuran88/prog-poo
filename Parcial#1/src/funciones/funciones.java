package funciones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funciones {
	
	private int costo;
	private int ancho;
	private int longi;
	private int suma;
	private int terreno;
	
	public funciones(){}
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat decfor = new DecimalFormat ("0.00");
	
	public int getCosto(){
		return this.costo;
	}
	
	public int getAncho(){
		return this.ancho;
	}
	
	public int getLongi(){
		return this.longi;
	}
	
	public int getSuma(){
		return this.suma;
	}
	
	public int getTerreno(){
		return this.terreno;
	}
	
	public void setCosto(int c){
		this.costo = c;
	}
	
	public void setAncho(int a){
		this.ancho = a;
	}
	
	public void setLongi(int l){
		this.longi = l;
	}
	
	public void setSuma(int s){
		this.suma = s;
	}
	
	public void setTerreno(int t){
		this.terreno = t;
	}
	
	public void formulario(){
		
		funciones tierra = new funciones();
		
		System.out.println("***CALCULAR COSTO DE TERRENO***");
		System.out.println("Ingresar largo del terreno en mts: ");
		setLongi(teclado.nextInt());
		System.out.println("Ingresar ancho del terreno en mts: ");
		setAncho(teclado.nextInt());
		System.out.println("\n");
		
		suma = longi + ancho;
		costo = suma * 5;
	
		tierra.setCosto(5);
		System.out.println("Costo del mt2: $"+decfor.format(tierra.getCosto()));
		tierra.setSuma(suma);
		System.out.println("Total mts cuadrado: "+tierra.getSuma());
		tierra.setCosto(costo);
		System.out.println("Total costo del terreno: **$"+decfor.format(tierra.getCosto())+"**");
		System.out.println("\n");
		System.out.println("***<MUCHAS GRACIAS JUAN M. DURAN>***");
	}
	
}
