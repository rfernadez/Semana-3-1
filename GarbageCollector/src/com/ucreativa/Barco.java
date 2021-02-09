/**
 * 
 */
package com.ucreativa;

/**
 * @author rebe2
 *
 */
public class Barco {
	private String nombre;
	private int pulgadas;
	private String color;
	
	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 */
	// Constructor

	public Barco(String nombre, int pulgadas, String color) {
		this.nombre = nombre;
		this.pulgadas = pulgadas;
		this.color = color;
	}
	
	//métodos
		 
		/**
		 * @param peso
		 */
		public void flotar(int peso) {}
		 public void pitar () {}
		 
	
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", pulgadas=" + pulgadas + ", color=" + color + "]";
	}

	
	 @Override
	// finalize method is called on object once  
	// before garbage collecting it 
	 
	 protected void finalize() throws Throwable { 
	 System.out.println("Barco destruido");

	 } 

}
