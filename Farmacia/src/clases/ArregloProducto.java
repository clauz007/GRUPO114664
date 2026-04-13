package clases;
import java.util.ArrayList;

public class ArregloProducto {
	private ArrayList<Producto> lista;
	
	public ArregloProducto() {
		lista = new ArrayList<Producto>();
		Adicionar(new Producto(101, "Paracetamol", 50, 30, 0.50, 1.50));
		Adicionar(new Producto(102, "Aspirina", 30, 15, 0.30, 1.00));
		Adicionar(new Producto(201, "Vitamina C", 60, 30, 0.60, 1.80));
		Adicionar(new Producto(202, "Vitamina E", 35, 20, 0.80, 2.00));
		Adicionar(new Producto(501, "Pasta Dental", 15, 15, 2.50, 5.00));
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
	public int tamaño() {
		return lista.size();
	}
	public Producto Obtener (int p) {
		return lista.get(p);
	}
}
