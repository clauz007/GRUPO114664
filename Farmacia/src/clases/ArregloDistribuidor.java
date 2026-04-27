package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArregloDistribuidor {
	public ArrayList<Distribuidor>Lista;
	public ArregloDistribuidor() {
		Lista = new ArrayList<Distribuidor>();
		Adicionar(new Distribuidor(1, "Global Peruvian Shop S.a.C.", "GLOBAL PERUVIAN SHOP S.A.C.", "20602968007", "Limpieza", LocalDate.of(2026, 01, 22)));
		Adicionar(new Distribuidor(2, "Ab Peru E.I.R.L.", "AB PERU E.I.R.L.", "20602968481", "Lacteos", LocalDate.of(2026, 01, 15)));
	}
	
	public int Tamaño() {
		return Lista.size();
	}
	public Distribuidor Obtener(int D) {
		return Lista.get(D);
	}
	
	public void Adicionar(Distribuidor D) {
		Lista.add(D);
	}
	 public void Eliminar (Distribuidor D) {
		 Lista.remove(D);
	}
	 public Distribuidor Buscar (int cod) {
		 for (Distribuidor D : Lista) {
			 if ( D.getCodigo() == cod){
				 return D;
			 }
		 }
		 return null;
	 }
	 public void Modificar (Distribuidor Nuevo) {
		 for ( int i = 0; i < Lista.size(); i++) {
			 if (Lista.get(i).getCodigo() == Nuevo.getCodigo()){
				 Lista.set(i, Nuevo);
				 break; 
			 }
		 }
	 }
}
