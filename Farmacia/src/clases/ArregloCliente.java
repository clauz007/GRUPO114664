package clases;
import java.util.ArrayList;

public class ArregloCliente{
	private ArrayList<Cliente> lista;
	
	public ArregloCliente() {
		
	}
	public void Adicionar(Cliente c) {
		lista.add(c);
	}
	public Cliente Buscar (int documento) {
		for (Cliente c : lista) {
			if(c.getDocumento() == documento) {
				return c;
			}
		}
		return null;
	}
	public int tamaño() {
		return lista.size();
	}
	public Cliente Obtener (int c) {
		return lista.get(c);
	}
	public void Eliminar(Cliente c) {
		lista.remove(c);
	}
	public void Modificar(Cliente c) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getDocumento() == c.getDocumento()) {
				lista.set(i, c);
				break;
			}
		}
	}
}