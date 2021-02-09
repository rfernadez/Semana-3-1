package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Avion {
	private String marca;
	private int pasajeros;
	private int a�o;
	
	//getters y setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	//constructor 
	public Avion(String marca, int pasajeros, int a�o) {
		this.marca = marca;
		this.pasajeros = pasajeros;
		this.a�o = a�o;
	}
	
	//metodos
	/**
	 * @param altura
	 */
	public void volar(int altura) {}
	
	public void despegar(int velocidad){}

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", pasajeros=" + pasajeros + ", a�o=" + a�o + "]";
	}
	

	 @Override
		// finalize method is called on object once� 
		// before garbage collecting it 
		 
		 protected void finalize() throws Throwable { 
		 System.out.println("Avion destruido");

		 } 

	
}
