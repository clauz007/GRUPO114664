package clases;
import java.time.LocalDate;
import java.util.ArrayList;

public class ArregloProveedores {
	private ArrayList<Proveedores> lista;
	
	public ArregloProveedores() {
		lista = new ArrayList<Proveedores>();
		Adicionar(new Proveedores(1, "Global Peruvian Shop S.a.C.", "GLOBAL PERUVIAN SHOP S.A.C.", "20602968007", "970568017", 
							     "HuamanCarlos01@gmail.com", "Carlos Huaman","Limpieza", true, true, LocalDate.of(2026, 04, 19)));
		Adicionar(new Proveedores(2, "Ab Peru E.I.R.L.", "AB PERU E.I.R.L.", "20602968481", "950387468", 
			     "mari.perez@gmail.com", "Maria Perez","Lacteos", true, true, LocalDate.of(2026, 04, 19)));
	}
	
	public void Adicionar(Proveedores pr) {
		lista.add(pr);
	}
	public int tamaño() {
		return lista.size();
	}
	public Proveedores Obtener (int pr) {
		return lista.get(pr);
	}
	public Proveedores Buscar (int codigo) {
		for ( Proveedores pr: lista ) {
			if ( pr.getCodigo() == codigo) {
				return pr;
			}
		}
		return null;
	}
	public void Eliminar (int codigo) {
		Proveedores pr = Buscar(codigo);
		if (pr != null ) {
			lista.remove(pr);
		}
	}
	public void Modificar (Proveedores nuev) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCodigo() == nuev.getCodigo()) {
				lista.set(i, nuev);
				return ;
			}
		}
	}

}
