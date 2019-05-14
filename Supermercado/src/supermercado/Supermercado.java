package supermercado;

import java.util.ArrayList;
import java.util.Collections;
import supermercado.producto.*;

public class Supermercado {
	
	// auxiliary variables
	static String lowestPriceItem;
	static String highestPriceItem;
	
	// build a list
	static ArrayList<Producto> lista = new ArrayList<Producto>();

	public static void main(String[] args) {
		
		// build items
		Producto cocaCola = new Producto("Coca-Cola", "1.5", 18.00);
		Producto cocaZero = new Producto("Coca-Cola Zero", "1.5", 20.00);
		Producto frutillas = new Producto("Frutillas", "kilo", 64.00);
		Producto shampooSedal = new Producto("Shampoo Sedal", "500ml", 19.00);
		
		addItems(cocaCola, cocaZero, shampooSedal, frutillas);
		
		// show items
		displayList();
		
		System.out.println("==========================================================");
		
		// compare items
		Collections.sort(lista);
		
		lowestPriceItem = lista.get(0).getName();
		highestPriceItem = lista.get(3).getName();
		
		System.out.println("Producto más caro: " + highestPriceItem);
		System.out.println("Producto más barato: " + lowestPriceItem);
	}
	
	public static void displayList() {
		for(Producto item : lista) {
			System.out.println(item.toString());
		}
	}
	
	public static void addItems(Producto o1, Producto o2, Producto o3, Producto o4) {
		
		lista.add(o1);
		lista.add(o2);
		lista.add(o3);
		lista.add(o4);
	}

}
