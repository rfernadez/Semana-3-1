/**
 * 
 */
package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco barco1 = new Barco("Maria", 14, "Negro");
		
		System.out.println("Instancia 1");
		System.out.println(barco1.toString());
		System.out.println("=========");
		
		Carro carro1 = new Carro("Azul", "Hyundai", 2012);
		
		System.out.println("Instancia 2");
		System.out.println(carro1.toString());
		System.out.println("=========");
		
		Avion avion1 = new Avion("Airbus", 200, 2012);
		
		System.out.println("Instancia 3");
		System.out.println(avion1.toString());
		System.out.println("=========");
		
		
		barco1= null;
		System.gc();
		
		carro1= null;
		Runtime.getRuntime().gc(); 
		
		avion1= null;
		System.gc();
		
	}

}
