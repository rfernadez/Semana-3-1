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
	private int a�o;
	
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	/**
	 * 
	 */

	public Carro(String color, String marca, int a�o) {
		super();
		this.color = color;
		this.marca = marca;
		this.a�o = a�o;
	}
	
	//m�todos
	
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
		return "Carro [color=" + color + ", marca=" + marca + ", a�o=" + a�o + "]";
	}

	 @Override
		// finalize method is called on object once� 
		// before garbage collecting it 
		 
		 protected void finalize() throws Throwable { 
		 System.out.println("Carro destruido");

		 } 

}
