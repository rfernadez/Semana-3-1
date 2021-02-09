/**
 * 
 */
package com.ucreativa;

/**
 * @author rebe2
 *
 */
/**
 * @author rebe2
 *
 */
/**
 * @author rebe2
 *
 */
public class Carro {
	private String color;
	private String marca;
	private int año;
	
	//getter y setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	
	/**
	 * 
	 */

	public Carro(String color, String marca, int año) {
		super();
		this.color = color;
		this.marca = marca;
		this.año = año;
	}
	
	//métodos
	
	/**
	 * @param velocidad
	 */
	public void frenar(int velocidad) {}
	
	
	/**
	 * @param kilometros
	 */
	public void acelerar(double kilometros){}
	
	
	public void apagar(){}
	
	@Override
	public String toString() {
		return "Carro [color=" + color + ", marca=" + marca + ", año=" + año + "]";
	}

	 @Override
		// finalize method is called on object once  
		// before garbage collecting it 
		 
		 protected void finalize() throws Throwable { 
		 System.out.println("Carro destruido");

		 } 

}
