package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Avion {
	private String marca;
	private int pasajeros;
	private int año;
	
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	//constructor 
	public Avion(String marca, int pasajeros, int año) {
		this.marca = marca;
		this.pasajeros = pasajeros;
		this.año = año;
	}
	
	//metodos
	/**
	 * @param altura
	 */
	public void volar(int altura) {}
	
	public void despegar(int velocidad){}

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", pasajeros=" + pasajeros + ", año=" + año + "]";
	}
	

	 @Override
		// finalize method is called on object once  
		// before garbage collecting it 
		 
		 protected void finalize() throws Throwable { 
		 System.out.println("Avion destruido");

		 } 

	
}
