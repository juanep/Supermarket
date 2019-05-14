package supermercado.producto;

public class Producto implements Comparable<Producto>{
	
	// build variables
	private String name;
	
	private String contain;
	
	private double price;
	
	// setterWithArgs
	public Producto(String name, String contain, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.contain = contain;
		this.price = price;
	}

	// element getters
	public String getName() {
		
		return this.name;
	}
	
	public String getContain() {
		
		return this.contain;
	}
	
	public double getPrice() {
		
		return this.price;
	}
	
	// display an item
	@Override
	public String toString() {
		String state = "Nombre: " + this.name + " /// " + "Litros: " + this.contain + " /// " + "Precio: " + '$' + this.price;
		return state;
	}
	
	// compare two items
	public int compareTo(Producto o) {

		int resultado;
        if(this.price < o.price) {
        	resultado = -1;
        }
        else if(this.price > o.price) {
        	resultado = 1;
        }
        else {
            resultado = 0;
        }
        
        return resultado;
    }
	
}
