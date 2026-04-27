package clases;
import java.util.ArrayList;

public class ArregloProducto {
	private ArrayList<Producto> lista;
	
	public ArregloProducto() {
		lista = new ArrayList<Producto>();
		Adicionar(new Producto(101, "Gomitas", 50, 30, 0.50, 2.50));
		Adicionar(new Producto(102, "Gaseosas", 30, 15, 0.30, 5.00));
		Adicionar(new Producto(201,"Inka Chips", 60, 30, 0.60, 2.20));
		Adicionar(new Producto(202, "Galleta", 35, 20, 0.80, 2.00));
		Adicionar(new Producto(501, "Café", 15, 15, 2.50, 3.00));
	}
	
	public void Adicionar(Producto p) {
		lista.add(p);
	}
	public Producto Buscar (int código) {
		for (Producto p : lista) {
			if (p.getCódigo()== código) {
				return p;
			}
		}
		return null;
	}
	public Producto Buscar (String nom) {
		for (Producto p : lista) {
			if (p.getNom().equalsIgnoreCase(nom)) {
				return p;
			}
		}
		return null;
	}
	public int tamaño() {
		return lista.size();
	}
	public Producto Obtener (int p) {
		return lista.get(p);
	}
	public void Eliminar(Producto p) {
		lista.remove(p);	
	}
	public void Modificar(Producto p) {
		lista.remove(p);
	}
}
